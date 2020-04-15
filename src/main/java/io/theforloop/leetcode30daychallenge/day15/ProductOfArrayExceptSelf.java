package io.theforloop.leetcode30daychallenge.day15;

/**
 * @author Shubham
 */
/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
 * */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] postfix = new int[len];
        for(int i = 0 ; i<len ;i++){
            if(i==0){
                prefix[i] = 1;
            }else{
                prefix[i] = prefix[i-1]*nums[i-1];
            }
        }
        for(int i = len-1 ; i>=0 ;i--){
            if(i==len-1){
                postfix[i] = 1;
            }else{
                postfix[i] = postfix[i+1]*nums[i+1];
            }
        }
        for(int i = 0 ; i < len ; i++){
            nums[i] = prefix[i]*postfix[i];
        }
        return nums;
    }
}
