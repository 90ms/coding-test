package com.example.coding_test.leetcode.medium

import org.junit.Assert
import org.junit.Test

/**
 *https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Input : s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * */
class LongestSubstringWithoutRepeatingTest {

    private fun lengthOfLongestSubstring(s: String): Int {
        var tmp = ""
        var max = 0
        for (i in 0..s.lastIndex) {
            if (tmp.contains(s[i])) {
                tmp = tmp.takeLastWhile { it != s[i] }
            }
            tmp += s[i]
            if (tmp.length > max) {
                max = tmp.length
            }
        }
        return max
    }

    @Test
    fun solution() = Assert.assertEquals(
        RESULT_1, lengthOfLongestSubstring(ANSWER_1)
    )


    companion object {
        val ANSWER_1 = "abcabcbb"
        val RESULT_1 = 3
    }
}