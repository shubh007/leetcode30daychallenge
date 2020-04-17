package io.theforloop.leetcode30daychallenge.day17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class NumberOfIslandsTest {

    @Test
    void numIslandsTest1() {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int expRes = 1;
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int res = numberOfIslands.numIslands(grid);
        assertEquals(expRes,res);
    }
    @Test
    void numIslandsTest2() {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        int expRes = 3;
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int res = numberOfIslands.numIslands(grid);
        assertEquals(expRes,res);
    }
}