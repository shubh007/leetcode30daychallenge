package io.theforloop.leetcode30daychallenge.day17;

/**
 * @author Shubham
 */

import io.theforloop.leetcode30daychallenge.DataStructures.MatrixBfsNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *https://leetcode.com/problems/number-of-islands/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3302/
 * */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        int noOfRows = grid.length;
        if(noOfRows == 0){
            return 0;
        }
        int noOfCols = grid[0].length;
        boolean[][] isVisited = new boolean[noOfRows][noOfCols];
        for(int i = 0 ; i<noOfRows;i++){
            for(int j = 0 ; j<noOfCols;j++){
                if(!isVisited[i][j] && grid[i][j] == '1'){
                    bfs(grid,isVisited,noOfRows,noOfCols,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(char[][] grid,boolean[][] isVisited,int noOfRows,int noOfCols,int i,int j){
        Queue<MatrixBfsNode> q = new LinkedList<>();
        q.add(new MatrixBfsNode(i,j));
        isVisited[i][j] = true;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            MatrixBfsNode currNode = q.poll();
            for(int[] dir :directions){
                int nextI = currNode.row+dir[0];
                int nextJ = currNode.col+dir[1];
                if(isValidPath(grid,isVisited,noOfRows,noOfCols,nextI,nextJ)){
                    q.add(new MatrixBfsNode(nextI,nextJ));
                    isVisited[nextI][nextJ] = true;
                }
            }
        }
    }
    private boolean isValidPath(char[][] grid,
                                boolean[][] isVisited,
                                int noOfRows,int noOfCols,int i,int j){
        return (i>=0 && j>=0 && i<noOfRows && j<noOfCols && grid[i][j]=='1' && !isVisited[i][j] );
    }
}
