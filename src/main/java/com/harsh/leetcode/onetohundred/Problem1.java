package com.harsh.leetcode.onetohundred;

import java.util.Arrays;

public class Problem1 {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    return new int[]{i , j};
                }
            }
        }
        return null;
    }

    /*
    ********FOR TESTING IN MAIN METHOD,********
    ********COPY THE BELOW LINES IN METHOD********
     */
    public void copyToMainForTest() {
        Problem1 problem1 = new Problem1();
        System.out.println(Arrays.toString(problem1.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(problem1.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(problem1.twoSum(new int[]{3, 3}, 6)));
    }
}
