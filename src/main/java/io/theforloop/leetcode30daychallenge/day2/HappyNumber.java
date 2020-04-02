package io.theforloop.leetcode30daychallenge.day2;

/**
 * @author Shubham
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/
 * */
public class HappyNumber {

    //Detect Cycles with a HashSet
    public boolean isHappyApproachOne(int n) {
        Set<Integer> isVisited = new HashSet<>();
        int currValue = n ;
        while(currValue!=1 && !isVisited.contains(currValue)){
            isVisited.add(currValue);
            int nextValue = 0;
            while(currValue != 0){
                int lastDigit =  currValue%10;
                nextValue += (lastDigit*lastDigit);
                currValue /= 10;
            }
            currValue = nextValue;
        }
        return currValue==1;
    }

    Map<Integer,Integer> cache = new HashMap<>();

    //Floyd's Cycle-Finding Algorithm (Slow - fast pointer approach)
    public boolean isHappyApproachTwo(int n) {
        int slowVal = n ;
        int fastVal = findNext(findNext(n)) ;
        while(slowVal!=1 && fastVal!=1 && slowVal != fastVal){
            slowVal = findNext(slowVal);
            fastVal = findNext(findNext(fastVal));
        }
        return slowVal==1 || fastVal==1;
    }
    private int findNext(int currValue){
        if(cache.containsKey(currValue)){
            return cache.get(currValue);
        }
        int temp = currValue;
        int nextValue = 0;
        while(currValue != 0){
            int lastDigit =  currValue%10;
            nextValue += (lastDigit*lastDigit);
            currValue /= 10;
        }
        cache.put(temp,nextValue);
        return nextValue;
    }
}
