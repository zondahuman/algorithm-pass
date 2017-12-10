package com.abin.lee.algorithm.pass.leetcode.array;

import com.abin.lee.algorithm.pass.common.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abin on 2017/12/10 2017/12/10.
 * algorithm-pass
 * com.abin.lee.algorithm.pass.leetcode.array
 * [LeetCode] 1. Two Sum
 * 数组nums中，有两个元素的和是target，找出这两个元素的位置。
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(input, target);
        System.out.println("result="+ JsonUtil.toJson(result));
        int[] result1 = twoSumByOn(input, target);
        System.out.println("result1="+ JsonUtil.toJson(result1));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target == nums[i] + nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumByOn(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
