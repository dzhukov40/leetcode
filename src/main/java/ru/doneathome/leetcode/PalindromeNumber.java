package ru.doneathome.leetcode;

public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     *
     * Example 1:
     *
     * Input: 121
     * Output: true
     * Example 2:
     *
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     *
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * Follow up:
     *
     * Coud you solve it without converting the integer to a string?
     */

    public boolean isPalindrome(int x) {
        int[] result = new int[10];
        int localInt = x;

        if(x<0) {
            return false;
        }

        int number;
        int i;
        for(i = 0;  ;i++) {
            number = localInt%10; // берем самую правую цифру
            localInt /= 10;       // убираем самую правую цифру

            result[i] = number;

            if (localInt == 0) { // у нас кончилось число
                break;
            }
        }

        int length = (i+1)/2;
        for(int ii = 0; ii < length; ii++) {
            if (result[i - ii] != result[ii]) {
                return false;
            }
        }

        return true;
    }
}
