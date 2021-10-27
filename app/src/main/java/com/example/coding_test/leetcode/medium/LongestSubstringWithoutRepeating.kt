package com.example.coding_test.leetcode.medium

/**
 *https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Input : s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * */
object LongestSubstringWithoutRepeating {
    fun lengthOfLongestSubstring(s: String): Int {
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
}