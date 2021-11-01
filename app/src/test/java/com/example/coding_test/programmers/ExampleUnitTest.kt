package com.example.coding_test.programmers

import com.example.coding_test.programmers.level_1.PickTwoAndAdd
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun pickTwoAndAdd() {
//        val solution = TwoNumberAdd.solution1(intArrayOf(2, 1, 3, 4, 1))
        val solution = PickTwoAndAdd.solution2(intArrayOf(2, 1, 3, 4, 1))
        assertArrayEquals(RESULT_PICK_TWO_AND_ADD, solution)
    }


    companion object {
        val RESULT_PICK_TWO_AND_ADD = intArrayOf(2, 3, 4, 5, 6, 7)
    }
}