package io.theforloop.leetcode30daychallenge.day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class PerformStringShiftsTest {

    @Test
    void stringShiftTest1() {
        String s = "abc";
        int[][] shift = {{0,1},{1,2}};
        String expStr = "cab";
        PerformStringShifts performStringShifts = new PerformStringShifts();
        String res = performStringShifts.stringShift(s,shift);
        assertEquals(expStr,res);
    }
    @Test
    void stringShiftTest2() {
        String s = "abcdefg";
        int[][] shift = {{1,1},{1,1},{0,2},{1,3}};
        String expStr = "efgabcd";
        PerformStringShifts performStringShifts = new PerformStringShifts();
        String res = performStringShifts.stringShift(s,shift);
        assertEquals(expStr,res);
    }
}