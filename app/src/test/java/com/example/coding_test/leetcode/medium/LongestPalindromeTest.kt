package com.example.coding_test.leetcode.medium

import org.junit.Assert
import org.junit.Test

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * */
class LongestPalindromeTest {

    fun longestPalindrome(s: String): String {

        return ""
    }

    @Test
    fun solution() {
        val result = longestPalindrome(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = "babad"
        val RESULT_1 = "bab"
    }
}