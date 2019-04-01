package ru.doneathome.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * (*) проверили, входной массив НЕ отсортирован !!!
     * (*) есть только одна подходящая пара
     *
     * решения:
     *   1) каждый элемент с каждым
     *     - O(n) = n^2
     *   2) идем по всем элементам и кладем числа, которые хотелось бы найти для составленя пары
     *      каждый раз на новом элементе спрашиваем есть ли он там
     */

    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(target - nums[i], i);
            } else {
                return new int[]{ map.get(nums[i]), i };
            }
        }
        return null;
    }

}
