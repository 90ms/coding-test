package com.example.coding_test

import com.example.coding_test.leetcode.easy.PalindromeNumber
import com.example.coding_test.leetcode.hard.MedianOfTwoSortedArrays
import com.example.coding_test.programmers.level_1.CreateId
import org.junit.Assert
import org.junit.Test

class MedianOfTwoSortedArraysTest {

    @Test
    fun solution1() {
        val result = MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
//        val result = MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4))
        Assert.assertEquals(RESULT, result,0.0)
    }

    companion object {
        val RESULT: Double = 2.0
//        val RESULT: Double = 2.5
    }
}