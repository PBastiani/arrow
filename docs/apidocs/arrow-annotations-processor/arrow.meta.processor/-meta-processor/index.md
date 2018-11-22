---
title: MetaProcessor - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.processor](../index.html) / [MetaProcessor](./index.html)

# MetaProcessor

`abstract class MetaProcessor<A : `[`Annotation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-annotation/index.html)`> : `[`AbstractProcessor`](../../arrow.common.utils/-abstract-processor/index.html)`, `[`JvmMetaApi`](../../arrow.meta.encoder.jvm/-jvm-meta-api/index.html)

The Meta Processor provides access to the Meta Api and is meant to be extended by concrete processors.
It performs processing automatically provided the concrete processor implements:

override fun transform(annotatedElement: AnnotatedElement): FileSpec.Builder

[AnnotatedElement](-annotated-element/index.html) provides already reified `Type` instances from the Arrow meta AST
that attempts to unify as much info as possible from the annotated Kotlin code.

The Current [JvmMetaApi](../../arrow.meta.encoder.jvm/-jvm-meta-api/index.html) impl includes support for extracting information with a blend
of Kotlin Poet, TypeElement java api's and the Kotlin Metadata Library.

### Types

| [AnnotatedElement](-annotated-element/index.html) | `sealed class AnnotatedElement` |

### Constructors

| [&lt;init&gt;](-init-.html) | `MetaProcessor(annotation: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`A`](index.html#A)`>)`<br>The Meta Processor provides access to the Meta Api and is meant to be extended by concrete processors. It performs processing automatically provided the concrete processor implements: |

### Properties

| [typeElementToMeta](type-element-to-meta.html) | `open val typeElementToMeta: (classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`) -> `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html) |
| [typeNameDownKind](type-name-down-kind.html) | `open val typeNameDownKind: (typeName: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [typeNameToMeta](type-name-to-meta.html) | `open val typeNameToMeta: (typeName: TypeName) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Inherited Properties

| [downKind](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open val `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.downKind: `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open val `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.downKind: `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)<br>`open val `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.downKind: `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)<br>`open val `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.downKind: `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)<br>`open val `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.downKind: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)<br>`open val `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.downKind: `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html) |
| [kindWrapper](../../arrow.meta.encoder.jvm/-jvm-meta-api/kind-wrapper.html) | `open val `[`Type`](../../arrow.meta.ast/-type/index.html)`.kindWrapper: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>?`<br>Returns a Pair matching a type as wrapper and the type it wraps ex: SetK to Set |
| [kinded](../../arrow.meta.encoder.jvm/-jvm-meta-api/kinded.html) | `open val `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.kinded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [nestedTypeVariables](../../arrow.meta.encoder.jvm/-jvm-meta-api/nested-type-variables.html) | `open val `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>`<br>`open val `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>`<br>`open val `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>`<br>`open val `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>`<br>`open val `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>`<br>`open val `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>` |
| [projectedCompanion](../../arrow.meta.encoder.jvm/-jvm-meta-api/projected-companion.html) | `open val `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.projectedCompanion: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [requiredAbstractFunctions](../../arrow.meta.encoder.jvm/-jvm-meta-api/required-abstract-functions.html) | `open val `[`TypeClassInstance`](../../arrow.meta.encoder/-type-class-instance/index.html)`.requiredAbstractFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>` |
| [requiredParameters](../../arrow.meta.encoder.jvm/-jvm-meta-api/required-parameters.html) | `open val `[`TypeClassInstance`](../../arrow.meta.encoder/-type-class-instance/index.html)`.requiredParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>` |
| [type](../../arrow.meta.encoder.jvm/-jvm-meta-api/type.html) | `open val `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.type: `[`Type`](../../arrow.meta.ast/-type/index.html)`?` |

### Functions

| [getSupportedAnnotationTypes](get-supported-annotation-types.html) | `open fun getSupportedAnnotationTypes(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getSupportedSourceVersion](get-supported-source-version.html) | `open fun getSupportedSourceVersion(): `[`SourceVersion`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/SourceVersion.html) |
| [kotlinMetadataUtils](kotlin-metadata-utils.html) | `open fun kotlinMetadataUtils(): KotlinMetadataUtils` |
| [onProcess](on-process.html) | `open fun onProcess(annotations: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`>, roundEnv: `[`RoundEnvironment`](http://docs.oracle.com/javase/6/docs/api/javax/annotation/processing/RoundEnvironment.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Processor entry point |
| [processorUtils](processor-utils.html) | `open fun processorUtils(): `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |
| [transform](transform.html) | `abstract fun transform(annotatedElement: `[`AnnotatedElement`](-annotated-element/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Builder>` |

### Inherited Functions

| [JvmName](../../arrow.meta.encoder.jvm/-jvm-meta-api/-jvm-name.html) | `open fun JvmName(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Annotation`](../../arrow.meta.ast/-annotation/index.html) |
| [SuppressAnnotation](../../arrow.meta.encoder.jvm/-jvm-meta-api/-suppress-annotation.html) | `open fun SuppressAnnotation(vararg names: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Annotation`](../../arrow.meta.ast/-annotation/index.html) |
| [addExtraDummyArg](../../arrow.meta.encoder.jvm/-jvm-meta-api/add-extra-dummy-arg.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.addExtraDummyArg(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [asKotlin](../../arrow.meta.encoder.jvm/-jvm-meta-api/as-kotlin.html) | `open fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.asKotlin(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)<br>`open fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.asKotlin(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.asKotlin(): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)<br>`open fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.asKotlin(): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)<br>`open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.asKotlin(): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)<br>`open fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.asKotlin(): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html) |
| [asPlatform](../../arrow.meta.encoder.jvm/-jvm-meta-api/as-platform.html) | `open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.asPlatform(): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html) |
| [containsModifier](../../arrow.meta.encoder.jvm/-jvm-meta-api/contains-modifier.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.containsModifier(modifier: `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [countDummyArgs](../../arrow.meta.encoder.jvm/-jvm-meta-api/count-dummy-args.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.countDummyArgs(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [defaultDummyArgValue](../../arrow.meta.encoder.jvm/-jvm-meta-api/default-dummy-arg-value.html) | `open fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.defaultDummyArgValue(): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html) |
| [defaultDummyArgValues](../../arrow.meta.encoder.jvm/-jvm-meta-api/default-dummy-arg-values.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.defaultDummyArgValues(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [downKind](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.downKind(): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html) |
| [downKindParameters](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind-parameters.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindParameters(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [downKindReceiver](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind-receiver.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindReceiver(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [downKindReturnType](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind-return-type.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindReturnType(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [metaApi](../../arrow.meta.encoder.jvm/-jvm-meta-api/meta-api.html) | `open fun metaApi(): `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html) |
| [prependExtraDummyArg](../../arrow.meta.encoder.jvm/-jvm-meta-api/prepend-extra-dummy-arg.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.prependExtraDummyArg(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [process](../../arrow.common.utils/-abstract-processor/process.html) | `fun process(annotations: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`>, roundEnv: `[`RoundEnvironment`](http://docs.oracle.com/javase/6/docs/api/javax/annotation/processing/RoundEnvironment.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeConstrains](../../arrow.meta.encoder.jvm/-jvm-meta-api/remove-constrains.html) | `open fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.removeConstrains(): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)<br>`open fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.removeConstrains(): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)<br>`open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.removeConstrains(): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)<br>`open fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.removeConstrains(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)<br>`open fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.removeConstrains(): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)<br>`open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.removeConstrains(keepModifiers: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`>): `[`Func`](../../arrow.meta.ast/-func/index.html)<br>`open fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.removeConstrains(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.removeConstrains(): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html) |
| [removeDummyArgs](../../arrow.meta.encoder.jvm/-jvm-meta-api/remove-dummy-args.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.removeDummyArgs(): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [typeClassInstance](../../arrow.meta.encoder.jvm/-jvm-meta-api/type-class-instance.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.typeClassInstance(): `[`TypeClassInstance`](../../arrow.meta.encoder/-type-class-instance/index.html)`?`<br>Returns all the type information needed for type class introspection assuming this type element is a valid type class instance: An interface annotated with @extension with at least one type argument and extending another interface with one type argument as the first element in its extends clause |
| [typeNameDownKindImpl](../../arrow.meta.encoder.jvm/-jvm-meta-api/type-name-down-kind-impl.html) | `open fun typeNameDownKindImpl(typeName: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [wrap](../../arrow.meta.encoder.jvm/-jvm-meta-api/wrap.html) | `open fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)<br>`open fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)<br>`open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)<br>`open fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)<br>`open fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)<br>Applies replacement on a type recursively changing it's wrapper type for it's wrapped type and [MetaApi.getDownKind](#) as needed ex: Kind&lt;ForSetK, A&gt; -&gt; Set`open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.wrap(wrappedType: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>? = null): `[`Func`](../../arrow.meta.ast/-func/index.html)<br>Applies replacement on all types of this function recursively changing wrapper types for their wrapped type over all three receiver, parameters and return type. and [MetaApi.getDownKind](#) as needed |

### Extension Functions

| [log](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log.html) | `fun KotlinProcessingEnvironment.log(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logE](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-e.html) | `fun KotlinProcessingEnvironment.logE(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logMW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-m-w.html) | `fun KotlinProcessingEnvironment.logMW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-w.html) | `fun KotlinProcessingEnvironment.logW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| [ExtensionProcessor](../../arrow.instances/-extension-processor/index.html) | `class ExtensionProcessor : `[`MetaProcessor`](./index.html)`<extension>` |
