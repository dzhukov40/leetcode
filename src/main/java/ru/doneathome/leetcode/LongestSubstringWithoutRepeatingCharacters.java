package ru.doneathome.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * Example 1:
     *
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     *
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     *
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = 0;
        boolean flag = false;

        int result = chars.length > 0 ? 1 : 0;
        int buf = 0;

        for(int i = 0; i < chars.length; i++) {

            for(int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    break;
                }
                // тут есть вероятность и резон найти последовательность уникальную
                if(result < j - i + 1) {
                    flag = true;
                    for(int q = i; q <= j; q++) {
                        for(int k = q + 1; k <= j; k++) {
                            if(chars[q] == chars[k]) {
                                flag = false;
                            }
                        }
                    }
                    if(flag) {
                        result = j - i + 1;
                    }

                }

            }
        }

        return result;
    }


    public int lengthOfLongestSubstring2(String s) {

        char[] chars = s.toCharArray();

        Set<Character> set = new HashSet <>();

        int result = chars.length > 0 ? 1 : 0;
        int buf = 0;

        for(int i = 0; i < chars.length; i++) {
            buf = 0;
            for(int j = i; j < chars.length; j++) {
                buf++;
                set.add(chars[j]);

                if( buf != set.size() ) {
                    result = result > set.size() ? result : set.size();
                    set.clear();
                    break;
                }

            }
        }

        return result;
    }




}
