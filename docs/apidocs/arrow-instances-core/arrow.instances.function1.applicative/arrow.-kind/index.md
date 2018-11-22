---
title: arrow.instances.function1.applicative.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.function1.applicative](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](ap.html#I)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForFunction1, `[`I`](ap.html#I)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): (`[`I`](ap.html#I)`) -> `[`B`](ap.html#B) |
| [map](map.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](map.html#I)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): (`[`I`](map.html#I)`) -> `[`B`](map.html#B) |
| [map2](map2.html) | `fun <I, A, B, Z> Kind<Kind<ForFunction1, `[`I`](map2.html#I)`>, `[`A`](map2.html#A)`>.map2(arg1: Kind<Kind<ForFunction1, `[`I`](map2.html#I)`>, `[`B`](map2.html#B)`>, arg2: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): (`[`I`](map2.html#I)`) -> `[`Z`](map2.html#Z) |
| [map2Eval](map2-eval.html) | `fun <I, A, B, Z> Kind<Kind<ForFunction1, `[`I`](map2-eval.html#I)`>, `[`A`](map2-eval.html#A)`>.map2Eval(arg1: Eval<Kind<Kind<ForFunction1, `[`I`](map2-eval.html#I)`>, `[`B`](map2-eval.html#B)`>>, arg2: (Tuple2<`[`A`](map2-eval.html#A)`, `[`B`](map2-eval.html#B)`>) -> `[`Z`](map2-eval.html#Z)`): Eval<Kind<Kind<ForFunction1, `[`I`](map2-eval.html#I)`>, `[`Z`](map2-eval.html#Z)`>>` |
| [plus](plus.html) | `operator fun <I> Kind<Kind<ForFunction1, `[`I`](plus.html#I)`>, `[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>.plus(arg1: Kind<Kind<ForFunction1, `[`I`](plus.html#I)`>, `[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>): (`[`I`](plus.html#I)`) -> `[`BigDecimal`](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html) |
| [product](product.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`A`](product.html#A)`>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`B`](product.html#B)`>): (`[`I`](product.html#I)`) -> Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>`<br>`fun <I, A, B, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple3<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple3<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple4<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple4<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple5<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, E, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple5<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple6<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, E, FF, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple6<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple7<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, E, FF, G, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple7<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple8<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, E, FF, G, H, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple8<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple9<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`Z`](product.html#Z)`>`<br>`fun <I, A, B, C, D, E, FF, G, H, Z> Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, Tuple9<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`I`](product.html#I)`>>.product(arg1: Kind<Kind<ForFunction1, `[`I`](product.html#I)`>, `[`Z`](product.html#Z)`>): (`[`I`](product.html#I)`) -> Tuple10<`[`A`](product.html#A)`, `[`B`](product.html#B)`, `[`C`](product.html#C)`, `[`D`](product.html#D)`, `[`E`](product.html#E)`, `[`FF`](product.html#FF)`, `[`G`](product.html#G)`, `[`H`](product.html#H)`, `[`I`](product.html#I)`, `[`Z`](product.html#Z)`>` |
