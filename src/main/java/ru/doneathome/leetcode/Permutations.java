package ru.doneathome.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /**
     * Given a collection of distinct integers, return all possible permutations.
     *
     * Example:
     *
     * Input: [1,2,3]
     * Output:
     * [
     *   [1,2,3],
     *   [1,3,2],
     *   [2,1,3],
     *   [2,3,1],
     *   [3,1,2],
     *   [3,2,1]
     * ]
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int allCount = 0; //// число массивов ответа это фактариал от количесва чисел


        for(int i = 0; i < nums.length; i++) {

            for(int j = 0; j < allCount; j++) {


            }

        }


        return null;
    }
}
