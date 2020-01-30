package arrow.benchmarks

import arrow.core.Eval
import arrow.core.extensions.fx
import arrow.free.Trampoline
import arrow.free.TrampolineF
import arrow.free.extensions.fx
import arrow.free.runT
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.CompilerControl
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Measurement
import org.openjdk.jmh.annotations.Param
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.Warmup
import java.util.concurrent.TimeUnit

@State(Scope.Thread)
@Fork(2)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
open class TrampolineBench {

  @Param("20")
  var num = 0

  @Benchmark
  fun trampoline(): Int = trampolineFibonacci(num).runT()

  fun trampolineFibonacci(n: Int): TrampolineF<Int> =
    when {
      n < 2 -> Trampoline.done(n)
      else -> {
        TrampolineF.fx {
          val x = Trampoline.defer { trampolineFibonacci(n - 1) }.bind()
          val y = Trampoline.defer { trampolineFibonacci(n - 2) }.bind()
          x + y
        }
      }
    }

  @Benchmark
  fun eval(): Int = evalFibonacci(num).value()

  fun evalFibonacci(n: Int): Eval<Int> =
    when {
      n < 2 -> Eval.now(n)
      else -> {
        Eval.fx {
          val x = Eval.defer { evalFibonacci(n - 1) }.bind()
          val y = Eval.defer { evalFibonacci(n - 2) }.bind()
          x + y
        }
      }
    }
}
