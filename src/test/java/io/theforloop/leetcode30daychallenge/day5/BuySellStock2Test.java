package io.theforloop.leetcode30daychallenge.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class BuySellStock2Test {

    @Test
    void maxProfitTest1() {
        BuySellStock2 buySellStock2 = new BuySellStock2();
        int[] prices = {7,1,5,3,6,4};
        int expRes = 7;
        int res = buySellStock2.maxProfit(prices);
        assertEquals(expRes,res);
    }
    @Test
    void maxProfitTest2() {
        BuySellStock2 buySellStock2 = new BuySellStock2();
        int[] prices = {1,2,3,4,5};
        int expRes = 4;
        int res = buySellStock2.maxProfit(prices);
        assertEquals(expRes,res);
    }
    @Test
    void maxProfitTest3() {
        BuySellStock2 buySellStock2 = new BuySellStock2();
        int[] prices = {7,6,4,3,1};
        int expRes = 0;
        int res = buySellStock2.maxProfit(prices);
        assertEquals(expRes,res);
    }
}