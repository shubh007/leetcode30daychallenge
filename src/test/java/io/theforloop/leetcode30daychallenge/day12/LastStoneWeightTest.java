package io.theforloop.leetcode30daychallenge.day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class LastStoneWeightTest {

    @Test
    void lastStoneWeight() {
        int[] stones = {2,7,4,1,8,1};
        int expRes = 1;
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int res = lastStoneWeight.lastStoneWeight(stones);
        assertEquals(expRes,res);
    }
}