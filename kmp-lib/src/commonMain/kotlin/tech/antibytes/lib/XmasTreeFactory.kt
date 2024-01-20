/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

object XmasTreeFactory : XmasTreeFactoryContract {
    override fun generateXmasTree(height: UInt): XmasTree {
        val iHeight = height.toInt()
        val trunk = generateTrunk(iHeight.guardHeight())


        return List(iHeight) {
            val scoresHash = it
            val padding = pad(iHeight - it)
            val stem = hashPad(scoresHash)
            "$padding$stem#$stem$padding"
        } + trunk
    }

    private fun Int.guardHeight(): Int {
        return if (this == 0) {
            1
        } else {
            this
        }
    }

    private fun hashPad(length: Int): String = "".padStart(length,'#')

    private fun pad(height: Int): String = "".padStart(height - 1, '_')

    private fun generateTrunk(height: Int): List<String> {
        val padding = pad(height)
        return listOf(
            "$padding|$padding",
            "$padding|$padding"
        )
    }
}
