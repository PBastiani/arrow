---
title: POptional.compose - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [POptional](index.html) / [compose](./compose.html)

# compose

`open infix fun <C, D> compose(other: `[`POptional`](index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [POptional](index.html) with a [POptional](index.html)

`open infix fun <C, D> compose(other: `[`PPrism`](../-p-prism/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [POptional](index.html) with a [PPrism](../-p-prism/index.html)

`open infix fun <C, D> compose(other: `[`PLens`](../-p-lens/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [POptional](index.html) with a [PLens](../-p-lens/index.html)

`open infix fun <C, D> compose(other: `[`PIso`](../-p-iso/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`
`open infix fun <C, D> compose(other: `[`PSetter`](../-p-setter/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PSetter`](../-p-setter/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [POptional](index.html) with a [PIso](../-p-iso/index.html)

`open infix fun <C> compose(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`
`open infix fun <C> compose(other: `[`Getter`](../-getter/index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`

Compose a [POptional](index.html) with a [Fold](../-fold/index.html)

`open infix fun <C, D> compose(other: `[`PTraversal`](../-p-traversal/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PTraversal`](../-p-traversal/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [POptional](index.html) with a [PTraversal](../-p-traversal/index.html)
