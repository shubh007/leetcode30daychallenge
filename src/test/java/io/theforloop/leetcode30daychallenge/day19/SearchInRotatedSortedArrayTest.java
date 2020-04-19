package io.theforloop.leetcode30daychallenge.day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class SearchInRotatedSortedArrayTest {

    @Test
    void searchTest1() {
        int[] input = {4,5,6,7,0,1,2};
        int target = 0;
        int expRes = 4;
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int res = searchInRotatedSortedArray.search(input,target);
        assertEquals(expRes,res);
    }
    @Test
    void searchTest2() {
        int[] input = {4,5,6,7,0,1,2};
        int target = 3;
        int expRes = -1;
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int res = searchInRotatedSortedArray.search(input,target);
        assertEquals(expRes,res);
    }
    @Test
    void searchTest3() {
        int[] input ={1,2,3,4,5,6};
        int target = 4;
        int expRes = 3;
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int res = searchInRotatedSortedArray.search(input,target);
        assertEquals(expRes,res);
    }
}