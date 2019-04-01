package ru.doneathome.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);
        assertEquals(0 ,result[0]);
        assertEquals(1 ,result[1]);
    }

    @Test
    public void twoSum2() {
        int[] nums = {2,7,11,15, 18, 22, 45, 37, 54, 78, 84, 87, 92, 98, 105, 109, 120};
        int target = 33;

        int[] result = twoSum.twoSum(nums, target);
        assertEquals(3 ,result[0]);
        assertEquals(4 ,result[1]);
    }

    @Test
    public void twoSum3() {
        int[] nums = {2,7,11,15, 18, 22, 37, 45, 54, 78, 81, 87, 92, 98, 105, 109, 120};
        int target = 91;

        int[] result = twoSum.twoSum(nums, target);
        assertEquals(6 ,result[0]);
        assertEquals(8 ,result[1]);
    }
}