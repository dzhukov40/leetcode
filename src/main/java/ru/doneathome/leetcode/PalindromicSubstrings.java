package ru.doneathome.leetcode;

public class PalindromicSubstrings {
    /**
     * Given a string, your task is to count how many palindromic substrings in this string.
     *
     * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
     *
     * Example 1:
     *
     * Input: "abc"
     * Output: 3
     * Explanation: Three palindromic strings: "a", "b", "c".
     *
     *
     * Example 2:
     *
     * Input: "aaa"
     * Output: 6
     * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
     *
     *
     * Note:
     *
     * The input string length won't exceed 1000.
     */
    public int countSubstrings(String s) {
        int cnt = 0;

        char[] str = s.toCharArray();


        for(int j=0; j<2; j++) {
            for(int i=0; i< str.length; i++) {
                int left = i;
                int right = i+j;

                while(left>=0 && right<str.length && str[left] == str[right]) {
                    cnt++;
                    left--;
                    right++;
                }

            }
        }

        return cnt;
    }


}
