package io.theforloop.leetcode30daychallenge.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class BackspaceStringCompareTest {

    @Test
    void backspaceCompareTest1() {
        String  S = "ab#c", T = "ad#c" ;
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        assertTrue(backspaceStringCompare.backspaceCompare(S,T));
    }
    @Test
    void backspaceCompareTest2() {
        String  S = "ab##", T = "c#d#" ;
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        assertTrue(backspaceStringCompare.backspaceCompare(S,T));
    }
    @Test
    void backspaceCompareTest3() {
        String  S = "a##c", T = "#a#c" ;
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        assertTrue(backspaceStringCompare.backspaceCompare(S,T));
    }
    @Test
    void backspaceCompareTest4() {
        String  S = "a#c", T = "b" ;
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        assertFalse(backspaceStringCompare.backspaceCompare(S,T));
    }
}