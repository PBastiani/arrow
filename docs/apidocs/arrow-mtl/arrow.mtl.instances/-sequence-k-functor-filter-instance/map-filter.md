---
title: SequenceKFunctorFilterInstance.mapFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [SequenceKFunctorFilterInstance](index.html) / [mapFilter](./map-filter.html)

# mapFilter

`open fun <A, B> Kind<ForSequenceK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): SequenceK<`[`B`](map-filter.html#B)`>`

Overrides [FunctorFilter.mapFilter](../../arrow.mtl.typeclasses/-functor-filter/map-filter.html)

A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A.
