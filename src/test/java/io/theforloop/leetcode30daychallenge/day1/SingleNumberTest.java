package io.theforloop.leetcode30daychallenge.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class SingleNumberTest {

    @Test
    void singleNumberTest1() {
        int[] input = {2,2,1};
        int expRes = 1 ;
        SingleNumber singleNumber = new SingleNumber();
        int actRes = singleNumber.singleNumber(input);
        assertEquals(expRes,actRes);
    }
    @Test
    void singleNumberTest2() {
        int[] input = {4,1,2,1,2};
        int expRes = 4 ;
        SingleNumber singleNumber = new SingleNumber();
        int actRes = singleNumber.singleNumber(input);
        assertEquals(expRes,actRes);
    }
}