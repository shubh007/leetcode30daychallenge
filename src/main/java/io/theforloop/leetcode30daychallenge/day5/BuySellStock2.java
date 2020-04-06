package io.theforloop.leetcode30daychallenge.day5;

/**
 * @author Shubham
 */

/*
*https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3287/
* */
public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}
