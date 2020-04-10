package io.theforloop.leetcode30daychallenge.DataStructures;

/**
 * @author Shubham
 */
public class MinStackNode {
    public int min;
    public int val;
    public MinStackNode next;
    public MinStackNode(int min,int val){
        this.min = min;
        this.val = val;
    }
    public MinStackNode(int min,int val,MinStackNode next){
        this.min = min;
        this.val = val;
        this.next = next;
    }
}
