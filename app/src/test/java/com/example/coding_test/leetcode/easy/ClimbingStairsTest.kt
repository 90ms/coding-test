package com.example.coding_test.leetcode.easy

import org.junit.Assert
import org.junit.Test

class ClimbingStairsTest {

    private val input = 5
    private val expected = 8

    @Test
    fun test() {
        val result = solution(input)
        Assert.assertEquals(result, expected)
    }

    fun solution(n: Int) = (1..n).fold(1 to 1) { step, _ ->
        with(step) {
            second to first + second
        }
    }.first
}