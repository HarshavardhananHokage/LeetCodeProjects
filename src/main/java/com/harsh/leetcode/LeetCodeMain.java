package com.harsh.leetcode;

import com.harsh.leetcode.onetohundred.One;

import java.util.Arrays;

public class LeetCodeMain {

    public static void main(String[] args) {
        One one = new One();
        System.out.println(Arrays.toString(one.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(one.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(one.twoSum(new int[]{3, 3}, 6)));
    }
}
