package io.theforloop.leetcode30daychallenge.day18;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/minimum-path-sum/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3303/
 * */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int noOfRows = grid.length;
        if(noOfRows==0){
            return 0;
        }
        int noOfCols = grid[0].length;
        if(noOfCols==0){
            return 0;
        }
        int[][] res = new int[noOfRows][noOfCols];
        res[0][0] = grid[0][0];
        for(int index = 1 ; index<noOfCols ; index++){
            res[0][index] = res[0][index-1]+grid[0][index];
        }
        for(int index = 1 ; index<noOfRows ; index++){
            res[index][0] = res[index-1][0]+grid[index][0];
        }
        for(int row = 1 ; row<noOfRows ; row++){
            for(int col = 1 ; col<noOfCols ; col++){
                res[row][col] = Math.min(res[row-1][col],res[row][col-1])+grid[row][col];
            }
        }
        return res[noOfRows-1][noOfCols-1];
    }
}
