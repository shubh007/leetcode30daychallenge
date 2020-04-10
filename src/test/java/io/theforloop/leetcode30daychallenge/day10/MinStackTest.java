package io.theforloop.leetcode30daychallenge.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class MinStackTest {

    @Test
    void TestMinStack(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3,minStack.getMin());
        minStack.pop();
        assertEquals(0,minStack.top());
        assertEquals(-2,minStack.getMin());
    }

}