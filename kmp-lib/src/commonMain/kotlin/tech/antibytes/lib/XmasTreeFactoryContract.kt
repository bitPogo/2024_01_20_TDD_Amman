/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

typealias XmasTree = List<String>

interface XmasTreeFactoryContract {
    fun generateXmasTree(height: UInt): XmasTree
}