package io.theforloop.leetcode30daychallenge.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class CountingElementsTest {

    @Test
    void countElementsTest1() {
        CountingElements countingElements = new CountingElements();
        int[] arr = {1,2,3};
        int expRes = 2 ;
        int res = countingElements.countElements(arr);
        assertEquals(expRes,res);
    }
    @Test
    void countElementsTest2() {
        CountingElements countingElements = new CountingElements();
        int[] arr = {1,1,3,3,5,5,7,7};
        int expRes = 0 ;
        int res = countingElements.countElements(arr);
        assertEquals(expRes,res);
    }
    @Test
    void countElementsTest3() {
        CountingElements countingElements = new CountingElements();
        int[] arr = {1,3,2,3,5,0};
        int expRes = 3 ;
        int res = countingElements.countElements(arr);
        assertEquals(expRes,res);
    }
    @Test
    void countElementsTest4() {
        CountingElements countingElements = new CountingElements();
        int[] arr = {1,1,2,2};
        int expRes = 2 ;
        int res = countingElements.countElements(arr);
        assertEquals(expRes,res);
    }
}