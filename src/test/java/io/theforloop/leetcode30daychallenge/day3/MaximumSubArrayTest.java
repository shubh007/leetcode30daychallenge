package io.theforloop.leetcode30daychallenge.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class MaximumSubArrayTest {

    @Test
    void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expRes = 6;
        MaximumSubArray maximumSubarray = new MaximumSubArray();
        int res = maximumSubarray.maxSubArray(nums);
        assertEquals(expRes,res);
    }
}