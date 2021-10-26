package com.example.coding_test

import com.example.coding_test.leetcode.easy.RomanToInteger
import org.junit.Assert
import org.junit.Test

class RomanToIntegerTest {

    @Test
    fun solution1() {
        val result = RomanToInteger.romanToInt(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = "LVIII"
        val RESULT_1 = 58
    }
}