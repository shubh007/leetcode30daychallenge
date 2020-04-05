package io.theforloop.leetcode30daychallenge.day4;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/move-zeroes/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
 * */
public class MoveZeroes {
    public void moveZeroesApproachOne(int[] nums) {
        int len = nums.length;
        int nonZeroValueIndex = len-1 ;
        while(nonZeroValueIndex>0 && nums[nonZeroValueIndex] == 0){
            nonZeroValueIndex--;
        }
        for(int index = nonZeroValueIndex-1 ; index >=0;index--){
            if(nums[index] == 0){
                int tempIndex = index ;
                while(tempIndex < nonZeroValueIndex){
                    nums[tempIndex] = nums[tempIndex+1];
                    tempIndex++;
                }
                nums[nonZeroValueIndex--] = 0;
            }
        }
    }
    public void moveZeroesApproachTwo(int[] nums) {
        int len = nums.length;
        int firstZeroIndex = 0 ;
        while(firstZeroIndex<len && nums[firstZeroIndex] != 0){
            firstZeroIndex++;
        }
        for(int index = firstZeroIndex+1 ; index < len;index++){
            if(nums[index] != 0 ){
                nums[firstZeroIndex] =  nums[index];
                firstZeroIndex++;
            }
        }
        while(firstZeroIndex < len){
            nums[firstZeroIndex]  = 0;
            firstZeroIndex++;
        }
    }
}
