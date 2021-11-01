package com.example.coding_test.programmers

import com.example.coding_test.programmers.level_1.PickTwoAndAdd
import org.junit.Assert
import org.junit.Test

class PickTwoAndAddTest {

    @Test
    fun pickTwoAndAdd1() {
        val solution = PickTwoAndAdd.solution1(intArrayOf(2, 1, 3, 4, 1))
        Assert.assertArrayEquals(RESULT_PICK_TWO_AND_ADD, solution)
    }

    @Test
    fun pickTwoAndAdd2() {
        val solution = PickTwoAndAdd.solution2(intArrayOf(2, 1, 3, 4, 1))
        Assert.assertArrayEquals(RESULT_PICK_TWO_AND_ADD, solution)
    }


    companion object {
        val RESULT_PICK_TWO_AND_ADD = intArrayOf(2, 3, 4, 5, 6, 7)
    }


}