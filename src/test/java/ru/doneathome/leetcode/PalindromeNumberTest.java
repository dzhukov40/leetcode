package ru.doneathome.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void isPalindrome() {
        int x = 123;

        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(false, result);
    }

    @Test
    public void isPalindrome2() {
        int x = 123321;

        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(true, result);
    }

    @Test
    public void isPalindrome3() {
        int x = 0;

        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(true, result);
    }

    @Test
    public void isPalindrome4() {
        int x = -5;

        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(false, result);
    }

    @Test
    public void isPalindrome5() {
        int x = 10;

        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(false, result);
    }
}