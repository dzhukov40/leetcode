package ru.doneathome.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReverseIntegerTest {

    static ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void reverse() {
        int in = 120034;
        int result = reverseInteger.reverse(in);
        assertEquals(430021 ,result);
    }

    @Test
    public void reverse2() {
        int in = 1534236469;
        int result = reverseInteger.reverse(in);
        assertEquals(0 ,result);
    }

    @Test
    public void reverse3() {
        int in = 363847412;
        int result = reverseInteger.reverse(in);
        assertEquals(214748363 ,result);
    }

    @Test
    public void reverse4() {
        int in = 2147483647;
        int result = reverseInteger.reverse(in);
        assertEquals(0 ,result);
    }

    @Test
    public void reverse5() {
        int in = -2147483648;
        int result = reverseInteger.reverse(in);
        assertEquals(0 ,result);
    }

    @Test
    public void reverse6() {
        int in = 1534236469;
        int result = reverseInteger.reverse(in);
        assertEquals(0 ,result);
    }
}