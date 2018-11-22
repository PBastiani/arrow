---
title: TrampolineF - arrow-free
---

[arrow-free](../index.html) / [arrow.free](index.html) / [TrampolineF](./-trampoline-f.html)

# TrampolineF

`typealias TrampolineF<A> = `[`Free`](-free/index.html)`<ForFunction0, `[`A`](-trampoline-f.html#A)`>`

Trampoline is often used to emulate tail recursion. The idea is to have some step code that can be trampolined itself
to emulate recursion. The difference with standard recursion would be that there is no need to rewind the whole stack
when we reach the end of the stack, since the first value returned that is not a trampoline would be directly
returned as the overall result value for the whole function chain. That means Trampoline emulates what tail recursion
does.
