package ru.doneathome.leetcode;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next = new ListNode(6);

        // 321 + 654 == 975
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(5, result.val);
        assertEquals(7, result.next.val);
        assertEquals(9, result.next.next.val);
    }


    @Test
    public void е() {

        BigDecimal t = new BigDecimal("123456789012345.12");
        BigDecimal t2 = new BigDecimal("1.23457E+14");

        System.out.println( t.toPlainString() );
        System.out.println( t2.toPlainString() );

        Set<String> set = new HashSet<>();

        set.add(null);

    }









}