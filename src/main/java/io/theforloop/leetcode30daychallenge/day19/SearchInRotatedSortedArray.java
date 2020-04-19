package io.theforloop.leetcode30daychallenge.day19;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/search-in-rotated-sorted-array/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3304/
 * */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int low = 0 , high = nums.length-1;
        if(nums[low] == target){
            return low;
        }
        if(nums[high] == target){
            return high;
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        int pivotIndex = low;
        if(target > nums[nums.length-1]){
            low =   0;
            high = pivotIndex-1;
        }else{
            low = pivotIndex;
            high = nums.length-1;
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
