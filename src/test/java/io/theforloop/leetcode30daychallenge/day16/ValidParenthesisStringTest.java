package io.theforloop.leetcode30daychallenge.day16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class ValidParenthesisStringTest {

    @Test
    void checkValidStringTest1() {
        String input = "()";
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        assertTrue(validParenthesisString.checkValidString(input));
    }
    @Test
    void checkValidStringTest2() {
        String input = "(*)";
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        assertTrue(validParenthesisString.checkValidString(input));
    }
    @Test
    void checkValidStringTest3() {
        String input = "(*))";
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        assertTrue(validParenthesisString.checkValidString(input));
    }
    @Test
    void checkValidStringTest4() {
        String input = ")(";
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        assertFalse(validParenthesisString.checkValidString(input));
    }
    @Test
    void checkValidStringTest5() {
        String input = "((()))()(())(*()()())**(())()()()()((*()*))((*()*)";
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        assertTrue(validParenthesisString.checkValidString(input));
    }
}