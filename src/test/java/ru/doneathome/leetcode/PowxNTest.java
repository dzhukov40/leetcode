package ru.doneathome.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowxNTest {

    PowxN powxN = new PowxN();
    double DELTA = 0.000001;

    @Test
    public void myPow() {
        double value = 2.00000;
        int pow = 10;

        double result = powxN.myPow(value, pow);
        assertEquals(1024.00000, result, DELTA);
    }

    @Test
    public void myPow2() {
        double value = 2.10000;
        int pow = 3;

        double result = powxN.myPow(value, pow);
        assertEquals(9.26100, result, DELTA);
    }


    @Test
    public void myPow3() {
        double value = 2.00000;
        int pow = -2;

        double result = powxN.myPow(value, pow);
        assertEquals(0.25000, result, DELTA);
    }

    @Test
    public void myPow4() {
        double value = 7.00000;
        int pow = -3;

        double result = powxN.myPow(value, pow);
        assertEquals(0.002915, result, DELTA);
    }

    @Test
    public void myPow5() {
        double value = -5.00000;
        int pow = -5;

        double result = powxN.myPow(value, pow);
        assertEquals(-0.00032, result, DELTA);
    }

    @Test
    public void myPow6() {
        double value = 0.44528;
        int pow = 0;

        double result = powxN.myPow(value, pow);
        assertEquals(-0.00032, result, DELTA);
    }

}