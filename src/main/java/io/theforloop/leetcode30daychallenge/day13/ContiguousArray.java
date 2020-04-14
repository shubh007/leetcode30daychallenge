package io.theforloop.leetcode30daychallenge.day13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/contiguous-array/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
 * */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int val = nums[i] == 1 ? 1 : -1;
            count = count + val;
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}
