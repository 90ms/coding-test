package com.example.coding_test.leetcode.hard

import org.junit.Assert
import org.junit.Test

/**
 *https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * */
class MedianOfTwoSortedArraysTest {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val sumArray = (nums1 + nums2).sorted()
        val medianIndex = sumArray.size / 2

        return if (sumArray.size % 2 == 1) {
            sumArray[(medianIndex)].toDouble()
        } else {
            ((sumArray[(medianIndex)].toDouble() + sumArray[(medianIndex - 1)].toDouble()) / 2)
        }
    }

    @Test
    fun solution() {
        val result = findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
//        val result = MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4))
        Assert.assertEquals(RESULT, result,0.0)
    }

    companion object {
        val RESULT: Double = 2.0
//        val RESULT: Double = 2.5
    }
}