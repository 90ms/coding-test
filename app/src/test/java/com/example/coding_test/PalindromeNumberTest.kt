package com.example.coding_test

import com.example.coding_test.leetcode.easy.PalindromeNumber
import com.example.coding_test.programmers.level_1.CreateId
import org.junit.Assert
import org.junit.Test

class PalindromeNumberTest {

    @Test
    fun solution1() {
        val result = PalindromeNumber.isPalindrome(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = 121
        val RESULT_1 = true
    }
}