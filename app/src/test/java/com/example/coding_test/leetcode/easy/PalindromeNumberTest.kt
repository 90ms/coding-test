package com.example.coding_test.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 *Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example,
 * 121 is palindrome while 123 is not.
 *
 * Input: x= 121
 * Output: true
 * */
class PalindromeNumberTest {

    private fun isPalindrome(x: Int): Boolean = x.toString() == x.toString().reversed()

    @Test
    fun solution() {
        val result = isPalindrome(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = 121
        val RESULT_1 = true
    }
}