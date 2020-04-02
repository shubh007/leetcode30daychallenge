package io.theforloop.leetcode30daychallenge.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class HappyNumberTest {

    @Test
    void isHappyApproachOneTest1() {
        int input = 19;
        HappyNumber happyNumber = new HappyNumber();
        boolean actRes = happyNumber.isHappyApproachOne(input);
        assertTrue(actRes);
    }
    @Test
    void isHappyApproachOneTest2() {
        int input = 21;
        HappyNumber happyNumber = new HappyNumber();
        boolean actRes = happyNumber.isHappyApproachOne(input);
        assertFalse(actRes);
    }

    @Test
    void isHappyApproachTwoTest1() {
        int input = 19;
        HappyNumber happyNumber = new HappyNumber();
        boolean actRes = happyNumber.isHappyApproachTwo(input);
        assertTrue(actRes);
    }
    @Test
    void isHappyApproachTwoTest2() {
        int input = 21;
        HappyNumber happyNumber = new HappyNumber();
        boolean actRes = happyNumber.isHappyApproachTwo(input);
        assertFalse(actRes);
    }
}