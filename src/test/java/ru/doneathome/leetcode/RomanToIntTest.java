package ru.doneathome.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {

    static RomanToInt romanToInt = new RomanToInt();

    @Test
    public void romanToInt() {
        String in = "IX";
        int result = romanToInt.romanToInt(in);
        assertEquals(9 ,result);
    }


    @Test
    public void romanToInt2() {
        String in = "XIX";
        int result = romanToInt.romanToInt(in);
        assertEquals(19 ,result);
    }

    @Test
    public void romanToInt3() {
        String in = "XXLI";
        int result = romanToInt.romanToInt(in);
        assertEquals(51 ,result);
    }

}