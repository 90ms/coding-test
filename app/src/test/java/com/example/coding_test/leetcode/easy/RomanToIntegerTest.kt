package com.example.coding_test.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * */
class RomanToIntegerTest {

    private val map = mutableMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultInt = 0
    var last = map['M'] ?: 1000

    private fun romanToInt(s: String): Int {
        s.forEach { char ->
            val value = map[char] ?: 0
            if (value > last) resultInt -= last * 2
            resultInt += value
            last = value
        }

        return resultInt
    }

    @Test
    fun solution() {
        val result = romanToInt(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = "LVIII"
        val RESULT_1 = 58
    }
}