package io.theforloop.leetcode30daychallenge.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class MoveZeroesTest {

    @Test
    void moveZeroesApproachOne1() {
        int[] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesApproachOne(nums);
        int[] exp = {1,3,12,0,0};
        for(int index = 0 ; index < nums.length ; index++){
            assertEquals(exp[index],nums[index]);
        }
    }
    @Test
    void moveZeroesApproachOne2() {
        int[] nums = {0};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesApproachOne(nums);
        int[] exp = {0};
        for(int index = 0 ; index < nums.length ; index++){
            assertEquals(exp[index],nums[index]);
        }
    }
    @Test
    void moveZeroesApproachTwo1() {
        int[] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesApproachTwo(nums);
        int[] exp = {1,3,12,0,0};
        for(int index = 0 ; index < nums.length ; index++){
            assertEquals(exp[index],nums[index]);
        }
    }
    @Test
    void moveZeroesApproachTwo2() {
        int[] nums = {1};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesApproachTwo(nums);
        int[] exp = {1};
        for(int index = 0 ; index < nums.length ; index++){
            assertEquals(exp[index],nums[index]);
        }
    }
}