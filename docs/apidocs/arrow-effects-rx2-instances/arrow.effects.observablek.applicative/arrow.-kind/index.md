---
title: arrow.effects.observablek.applicative.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.observablek.applicative](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForObservableK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForObservableK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ObservableK<`[`B`](ap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `fun <A, B, Z> Kind<ForObservableK, `[`A`](map2.html#A)`>.map2(arg1: Kind<ForObservableK, `[`B`](map2.html#B)`>, arg2: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): ObservableK<`[`Z`](map2.html#Z)`>` |
| [map2Eval](map2-eval.html) | `fun <A, B, Z> Kind<ForObservableK, `[`A`](map2-eval.html#A)`>.map2Eval(arg1: Eval<Kind<ForObservableK, `[`B`](map2-eval.html#B)`>>, arg2: (Tuple2<`[`A`](map2-eval.html#A)`, `[`B`](map2-eval.html#B)`>) -> `[`Z`](map2-eval.html#Z)`): Eval<Kind<ForObservableK, `[`Z`](map2-eval.html#Z)`>>` |
| [plus](plus.html) | `operator fun Kind<ForObservableK, `[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>.plus(arg1: Kind<ForObservableK, `[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>): ObservableK<`[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>` |
| [product](product.html) | `fun <A, B> Kind<ForObservableK, `[`A`](product.html#A)`>.product(arg1: Kind<ForObservableK, `[`B`](product.html#B)`>): ObservableK<Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>>`<br>`fun <A, B, Z> Kind<ForObservableK, Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple3<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, Z> Kind<ForObservableK, Tuple3<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple4<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, Z> Kind<ForObservableK, Tuple4<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple5<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, E, Z> Kind<ForObservableK, Tuple5<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple6<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, E, FF, Z> Kind<ForObservableK, Tuple6<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple7<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, E, FF, G, Z> Kind<ForObservableK, Tuple7<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple8<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, E, FF, G, H, Z> Kind<ForObservableK, Tuple8<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple9<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`Z`](product.html#Z)`>>`<br>`fun <A, B, C, D, E, FF, G, H, I, Z> Kind<ForObservableK, Tuple9<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`I`](product.html#I)`>>.product(arg1: Kind<ForObservableK, `[`Z`](product.html#Z)`>): ObservableK<Tuple10<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`I`](product.html#I)`, `[`Z`](product.html#Z)`>>` |
