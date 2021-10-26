package com.example.coding_test.leetcode.hard

/**
 *https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * */
object MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val sumArray = (nums1 + nums2).sorted()
        val medianIndex = sumArray.size / 2

        return if (sumArray.size % 2 == 1) {
            sumArray[(medianIndex)].toDouble()
        } else {
            ((sumArray[(medianIndex)].toDouble() + sumArray[(medianIndex - 1)].toDouble()) / 2)
        }
    }
}