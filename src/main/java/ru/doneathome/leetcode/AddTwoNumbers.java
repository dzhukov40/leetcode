package ru.doneathome.leetcode;

public class AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Example:
     *
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;

        int buf = 0;

        ListNode l1NodeBuf = l1;
        ListNode l2NodeBuf = l2;

        int l1ValueBuf = l1.val;
        int l2ValueBuf = l2.val ;

        for (;;) {



            buf = l1NodeBuf.val + l2NodeBuf.val;





            if(l1.next == null && l2.next == null) {
                break;
            }

        }



        return null;
    }
}
