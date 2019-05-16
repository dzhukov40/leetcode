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

        ListNode iteratorL1 = l1;
        ListNode iteratorL2 = l2;

        ListNode result = null;
        ListNode iteratorResult = null;
        int bufResult = 0;

        while( iteratorL1 != null || iteratorL2 != null ) {

            if(  iteratorL1 == null || (iteratorL2 != null && iteratorL1.val > iteratorL2.val ) ) {
                bufResult = iteratorL2.val;
                iteratorL2 = iteratorL2.next;
            } else {
                bufResult = iteratorL1.val;
                iteratorL1 = iteratorL1.next;
            }

            if (result == null) {
                result = new ListNode(bufResult);
                iteratorResult = result;
            } else {
                iteratorResult.next = new ListNode(bufResult);
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




