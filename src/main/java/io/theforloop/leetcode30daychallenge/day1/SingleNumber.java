package io.theforloop.leetcode30daychallenge.day1;

/**
 * @author Shubham
 */

/*
* https://leetcode.com/problems/single-number/
* https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3283/
* */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int res = nums[0];
        for(int index = 1 ; index < nums.length ; index++){
            res ^= nums[index];
        }
        return res;
    }
}
