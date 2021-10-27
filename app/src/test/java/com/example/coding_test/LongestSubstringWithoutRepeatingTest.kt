package com.example.coding_test

import com.example.coding_test.leetcode.medium.LongestSubstringWithoutRepeating
import org.junit.Assert
import org.junit.Test

class LongestSubstringWithoutRepeatingTest {

    @Test
    fun solution() = Assert.assertEquals(
        RESULT_1,
        LongestSubstringWithoutRepeating.lengthOfLongestSubstring(ANSWER_1)
    )


    companion object {
        val ANSWER_1 = "abcabcbb"
        val RESULT_1 = 3
    }
}