package io.theforloop.leetcode30daychallenge.day12;

/**
 * @author Shubham
 */

import java.util.PriorityQueue;

/**
 *https://leetcode.com/problems/last-stone-weight/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/
 * */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2)->{return i2.compareTo(i1);});
        for(int weight:stones){
            pq.add(weight);
        }
        while(pq.size()>1){
            int stoneOne = pq.poll();
            int stoneTwo = pq.poll();
            int left = stoneOne-stoneTwo;
            pq.add(left);
        }
        if(!pq.isEmpty()) {
            return pq.peek();
        }
        return 0;
    }
}
