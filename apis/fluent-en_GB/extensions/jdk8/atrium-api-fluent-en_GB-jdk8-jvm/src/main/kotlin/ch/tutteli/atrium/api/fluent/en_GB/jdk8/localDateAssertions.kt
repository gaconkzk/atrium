package ch.tutteli.atrium.api.fluent.en_GB.jdk8

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.domain.builders.localDate
import java.time.LocalDate


/**
 * Creates an [Expect] for the property [LocalDate.year][LocalDate.getYear] of the subject of the assertion,
 * so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect].
 *
 * @since 0.9.0
 */
val Expect<LocalDate>.year get(): Expect<Int> = ExpectImpl.localDate.year(this).getExpectOfFeature()

/**
 * Expects that the property [LocalDate.year][LocalDate.getYear]of the subject of the assertion
 * holds all assertions the given [assertionCreator] creates for it and returns this assertion container.
 *
 * @return This assertion container to support a fluent API.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.9.0
 */
fun Expect<LocalDate>.year(assertionCreator: Expect<Int>.() -> Unit): Expect<LocalDate> =
    ExpectImpl.localDate.year(this).addToInitial(assertionCreator)
