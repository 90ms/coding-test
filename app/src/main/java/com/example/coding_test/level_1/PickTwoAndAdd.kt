package com.example.coding_test.level_1

import java.util.*

/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=kotlin#
 * */
object PickTwoAndAdd {

    fun solution1(numbers: IntArray): IntArray {
        val tmpArray: ArrayList<Int> = ArrayList()
        val returnArray: IntArray

        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                val sum = numbers[i] + numbers[j]
                if (tmpArray.indexOf(sum) < 0) {
                    tmpArray.add(sum)
                }
            }
        }

        returnArray = IntArray(tmpArray.size)
        for (i in 0 until tmpArray.size) {
            returnArray[i] = tmpArray[i]
        }
        Arrays.sort(returnArray)
        return returnArray
    }

    fun solution2(numbers: IntArray): IntArray {
        val list = numbers.toList()
        return list.withIndex().flatMap { i -> list.withIndex().map { j -> i to j } }
            .filter { it.first.index != it.second.index }
            .map { it.first.value + it.second.value }
            .toSortedSet()
            .toIntArray()
    }
}