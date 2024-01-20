/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.util.test.fulfils
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test

class XMasTreeSpec {
    @Test
    @JsName("fn01")
    fun `It fulfils the XmasTreeFactoryContract`() {
        XmasTreeFactory fulfils XmasTreeFactoryContract::class
    }

    @Test
    @JsName("fn2")
    fun `Given the height is 0 it returns the trunk`() {
        // Given
        val height = 0u

        // When
        val actual = XmasTreeFactory.generateXmasTree(height)

        // Then
        actual mustBe listOf(
            "|",
            "|"
        )
    }

    @Test
    @JsName("fn3")
    fun `Given the height is 1 it returns a top and trunk `() {
        // Given
        val height = 1u

        // When
        val actual = XmasTreeFactory.generateXmasTree(height)

        // Then
        val expected = listOf(
            "#",
            "|",
            "|"
        )

        actual mustBe expected
    }

    @Test
    @JsName("fn4")
    fun `Given the height is 3 it returns a top and stem of 2 and trunk `() {
        // Given
        val height = 3u

        // When
        val actual = XmasTreeFactory.generateXmasTree(height)

        // Then
        val expected = listOf(
            "__#__",
            "_###_",
            "#####",
            "__|__",
            "__|__",
        )

        actual mustBe expected
    }

    @Test
    @JsName("fn5")
    fun `Given the height is 5 it returns a top and stem of 4 and trunk `() {
        // Given
        val height = 5u

        // When
        val actual = XmasTreeFactory.generateXmasTree(height)

        // Then
        val expected = listOf(
            "____#____",
            "___###___",
            "__#####__",
            "_#######_",
            "#########",
            "____|____",
            "____|____",
        )

        actual mustBe expected
    }
}