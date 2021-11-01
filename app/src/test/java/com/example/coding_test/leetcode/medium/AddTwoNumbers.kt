package com.example.coding_test.leetcode.medium

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation : 342 + 465 = 807
 * */
class AddTwoNumbers {

    fun solution(l1: ListNode?, l2: ListNode?): ListNode? {
        var tmp1: ListNode? = l1
        var tmp2: ListNode? = l2
        var carry = 0

        val ans = ListNode(-1)
        var tmpAns = ans

        while (tmp1 != null || tmp2 != null || carry > 0) {
            var cal = 0
            tmp1?.let {
                cal += it.`val`
                tmp1 = it.next
            }
            tmp2?.let {
                cal += it.`val`
                tmp2 = it.next
            }

            cal += carry
            if (cal >= 10) {
                carry = 1
                cal %= 10
            } else {
                carry = 0
            }

            tmpAns.next = ListNode(cal)
            tmpAns = tmpAns.next!!
        }


        return ans.next
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? =
        takeUnless {
            null == l1 && null == l2 && carry < 1
        }?.let {
            val sum = l1.value() + l2.value() + carry
            ListNode(sum % 10).apply {
                next = addTwoNumbers(l1?.next, l2?.next, sum / 10)
            }
        }

    private fun ListNode?.value() = this?.`val` ?: 0

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
