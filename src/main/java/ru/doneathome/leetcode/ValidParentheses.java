package ru.doneathome.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     *
     * Example 1:
     *
     * Input: "()"
     * Output: true
     * Example 2:
     *
     * Input: "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: "(]"
     * Output: false
     * Example 4:
     *
     * Input: "([)]"
     * Output: false
     * Example 5:
     *
     * Input: "{[]}"
     * Output: true
     */
    public boolean isValid(String s) {

        Map<Character, Character> mapClose = new HashMap<>();
        mapClose.put('(',')');
        mapClose.put('{','}');
        mapClose.put('[',']');

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();


        for(int i = 0; i < chars.length; i++) {

            if( mapClose.containsKey(chars[i]) ) {
                stack.push(chars[i]);
            } else {

                if( stack.empty() || !mapClose.get(stack.peek()).equals(chars[i]) ) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }


}
