package io.theforloop.leetcode30daychallenge.day7;

/**
 * @author Shubham
 */

import java.util.HashSet;
import java.util.Set;

/**
 *
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/
 * */
public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int val : arr){
            set.add(val);
        }
        int res = 0 ;
        for(int val : arr){
            if(set.contains(val+1)){
                res++;
            }
        }
        return res;
    }
}
