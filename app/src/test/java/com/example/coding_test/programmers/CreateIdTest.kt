package com.example.coding_test.programmers

import com.example.coding_test.programmers.level_1.CreateId
import org.junit.Assert
import org.junit.Test

class CreateIdTest {

    @Test
    fun solution1() {
        val result = CreateId.solution(ANSWER_1)
        Assert.assertEquals(RESULT_1, result)
    }

    companion object {
        val ANSWER_1 = ".ABCd...1..2345!@#$%^&*()_+-.,12345."
        val RESULT_1 = "abcd.1.2345_-.12345"
    }
}