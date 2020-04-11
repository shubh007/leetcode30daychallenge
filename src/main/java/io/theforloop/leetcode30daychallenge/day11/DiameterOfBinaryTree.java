package io.theforloop.leetcode30daychallenge.day11;

/**
 * @author Shubham
 */

import io.theforloop.leetcode30daychallenge.DataStructures.TreeNode;

/**
 *https://leetcode.com/problems/diameter-of-binary-tree/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3293/
 * */
public class DiameterOfBinaryTree {
    private int maxLen = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        findLongestPath(root);
        return maxLen;
    }
    private int findLongestPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftLen = findLongestPath(root.left) ;
        int rightLen = findLongestPath(root.right);
        int pathLen = leftLen + rightLen ;
        maxLen = Math.max(pathLen,maxLen);
        return  Math.max(leftLen,rightLen)+1;
    }

}
