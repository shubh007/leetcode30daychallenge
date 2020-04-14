package io.theforloop.leetcode30daychallenge.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class ContiguousArrayTest {

    @Test
    void findMaxLengthTest1() {
        int[] input = {0,1};
        int expRes = 2;
        ContiguousArray contiguousArray = new ContiguousArray();
        int res = contiguousArray.findMaxLength(input);
        assertEquals(expRes,res);
    }
    @Test
    void findMaxLengthTest2() {
        int[] input = {0,1,0};
        int expRes = 2;
        ContiguousArray contiguousArray = new ContiguousArray();
        int res = contiguousArray.findMaxLength(input);
        assertEquals(expRes,res);
    }
    @Test
    void findMaxLengthTest3() {
        int[] input = {0 ,0 ,1 ,0, 0 ,0 ,1 ,1};
        int expRes = 6;
        ContiguousArray contiguousArray = new ContiguousArray();
        int res = contiguousArray.findMaxLength(input);
        assertEquals(expRes,res);
    }
}