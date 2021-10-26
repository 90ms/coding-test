package com.example.coding_test.leetcode.easy

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { i, num ->
            if (map.containsKey(num)) {
                map[num]?.let {
                    return intArrayOf(it, i)
                }
            }
            map[target - num] = i
        }

        return intArrayOf()
    }
}