package io.theforloop.leetcode30daychallenge.day10;

/**
 * @author Shubham
 */

import io.theforloop.leetcode30daychallenge.DataStructures.MinStackNode;

/**
 *https://leetcode.com/problems/min-stack/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/
 * */
public class MinStack {

    private MinStackNode head;
    public MinStack() {
        head = null;
    }

    public void push(int x) {
        if(head == null){
            head = new MinStackNode(x,x);
        }else{
            head = new MinStackNode(Math.min(x,head.min),x,head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
