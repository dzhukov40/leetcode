package ru.doneathome.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
     *
     *
     * решения:
     *   1) идем справа на лево и считаем прибавляя или отнимая значение от результата
     */

    public int romanToInt(String s) {
        int result = 0;
        char charBefore = 'I';

        for(int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': result = (charBefore == 'V' || charBefore == 'X') ? result - 1 : result + 1;   break;
                case 'V': result += 5; break;
                case 'X': result = (charBefore == 'L' || charBefore == 'C') ? result - 10 : result + 10;   break;
                case 'L': result += 50; break;
                case 'C':result = (charBefore == 'D' || charBefore == 'M') ? result - 100 : result + 100;   break;
                case 'D': result += 500; break;
                case 'M': result += 1000; break;
            }
            charBefore = s.charAt(i);
        }

        return result;
    }

}
