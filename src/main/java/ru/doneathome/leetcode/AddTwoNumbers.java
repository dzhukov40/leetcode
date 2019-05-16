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

        ListNode iteratorL1 = l1;
        ListNode iteratorL2 = l2;

        ListNode listNode = null;
        ListNode iterator = null;

        int buf1, buf2, bufResult;
        boolean carryFlag = false;
        boolean endIteratofFlag1 = false;
        boolean endIteratofFlag2 = false;

        while(true) {
            if (endIteratofFlag1 && endIteratofFlag2) {
                break;
            }

            buf1 = endIteratofFlag1 ? 0 : iteratorL1.val;
            buf2 = endIteratofFlag2 ? 0 : iteratorL2.val;

            bufResult = carryFlag ? buf1 + buf2 + 1 :  buf1 + buf2;
            carryFlag = bufResult > 9;

            if (listNode == null) {
                listNode = new ListNode(bufResult%10);
                iterator = listNode;
            } else {
                iterator.next = new ListNode(bufResult%10);
                iterator = iterator.next;
            }

            if (iteratorL1.next == null) {
                endIteratofFlag1 = true;
            } else {
                iteratorL1 = iteratorL1.next;
            }

            if (iteratorL2.next == null) {
                endIteratofFlag2 = true;
            } else {
                iteratorL2 = iteratorL2.next;
            }
        }

        if(carryFlag) {
            iterator.next = new ListNode(1);
        }

        return listNode;
    }

    // класс определен в задании
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

