// Copyright (C) 2019 Till Kottmann <me@deletescape.ch>
//
// SPDX-License-Identifier: MIT

package kute.strings

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class StringsTest {

    @Test
    fun `count lines, has 3`() {
        val str = """
            1
            2
            3
        """.trimIndent()
        assertThat(str.lineCount, equalTo(3))
    }

    @Test
    fun `count lines, has 1`() {
        val str = "1"
        assertThat(str.lineCount, equalTo(1))
    }

    @Test
    fun `blankAsNull test`() {
        assertThat("aaa".blankAsNull(), equalTo("aaa"))
        assertThat("aaa ".blankAsNull(), equalTo("aaa "))
        assertNull(" ".blankAsNull())
        assertNull("".blankAsNull())
    }

    @Test
    fun `emptyAsNull test`() {
        assertThat("aaa".emptyAsNull(), equalTo("aaa"))
        assertThat("aaa ".emptyAsNull(), equalTo("aaa "))
        assertThat(" ".emptyAsNull(), equalTo(" "))
        assertNull("".emptyAsNull())
    }
}