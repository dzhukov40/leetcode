package ru.doneathome.leetcode;

public class MergeTwoSortedLists {
    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     *
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode iteratorResult = null;
        ListNode bufResult;

        while( l1 != null || l2 != null ) {

            if(  l1 == null || (l2 != null && l1.val > l2.val ) ) {
                bufResult = l2;
                l2 = l2.next;
            } else {
                bufResult = l1;
                l1 = l1.next;
            }

            if (result == null) {
                result = bufResult;
                iteratorResult = result;
            } else {
                iteratorResult.next = bufResult;
                iteratorResult = iteratorResult.next;
            }
        }

        return result;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}




