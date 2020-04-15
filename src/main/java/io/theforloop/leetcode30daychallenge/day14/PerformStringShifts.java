package io.theforloop.leetcode30daychallenge.day14;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3299/
 * */
public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int len = s.length();
        if(len <= 1){
            return s;
        }
        int numberOfRightShift = 0;
        for(int[] val:shift){
            int tVal = val[0]==0?(val[1]*-1):val[1];
            numberOfRightShift += tVal;
        }
        System.out.println(numberOfRightShift);
        int shiftAbs = Math.abs(numberOfRightShift)%len;
        if(shiftAbs==0){
            return s;
        }
        int subStrIndex = shiftAbs ;
        if(numberOfRightShift > 0){
            subStrIndex = len-shiftAbs;
        }
        return s.substring(subStrIndex)+s.substring(0,subStrIndex);
    }
}
