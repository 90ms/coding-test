package com.example.coding_test.leetcode.easy

/**
 *Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example,
 * 121 is palindrome while 123 is not.
 *
 * Input: x= 121
 * Output: true
 * */
object PalindromeNumber {
    fun isPalindrome(x: Int): Boolean = x.toString() == x.toString().reversed()
}