package ru.doneathome.leetcode;

public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     * Example 1:
     *
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     *
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * Note:
     *
     * All given inputs are in lowercase letters a-z.
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        char buf;

        if (strs.length == 0) {
            return result.toString();
        }

        for(int i = 0; i < strs[0].length(); i++) {  // это проход по буквам (*) берем первое слово за основу

            buf = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) { // проход по словам
                if( strs[j].length() <= i || buf != strs[j].charAt(i) ) {
                    return result.toString();
                }
            }
            result.append(buf);
        }

        return result.toString();
    }
}
