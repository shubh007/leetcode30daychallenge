package io.theforloop.leetcode30daychallenge.day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class MinimumPathSumTest {

    @Test
    void minPathSumTest1() {
        int[][] input = {{1,3,1},
                        {1,5,1},
                        {4,2,1}};
        int expExp = 7;
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int res = minimumPathSum.minPathSum(input);
        assertEquals(expExp,res);
    }
}