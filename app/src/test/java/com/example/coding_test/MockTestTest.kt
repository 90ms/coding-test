package com.example.coding_test

import com.example.coding_test.level_1.MockTest
import org.junit.Assert
import org.junit.Test

class MockTestTest {

    @Test
    fun solution1() {
        val result = MockTest.solution(ANSWER_1)
        Assert.assertArrayEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = intArrayOf(1,3,2,4,2)
        val RESULT_1 = intArrayOf(1, 2, 3)

        val ANSWER_2 = intArrayOf(1,2,3,4,5)
        val RESULT_2 = intArrayOf(1)
    }
}