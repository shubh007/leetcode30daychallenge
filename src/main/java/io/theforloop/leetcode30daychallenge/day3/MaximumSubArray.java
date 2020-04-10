package io.theforloop.leetcode30daychallenge.day3;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/maximum-subarray/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3285/
 * */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempMax = 0;
        for (int val:nums) {
            tempMax = Math.max(tempMax + val,val);
            max = Math.max(tempMax,max);
        }
        return max;
    }
}
