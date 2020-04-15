package io.theforloop.leetcode30daychallenge.day15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        int[] nums = {1,2,3,4};
        int[] expRes = {24,12,8,6};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] res = productOfArrayExceptSelf.productExceptSelf(nums);
        assertEquals(expRes.length,res.length);
        for(int i = 0 ; i< expRes.length; i++){
            assertEquals(expRes[i],res[i]);
        }
    }
}