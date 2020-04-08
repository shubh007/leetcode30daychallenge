package io.theforloop.leetcode30daychallenge.day8;

/**
 * @author Shubham
 */

import io.theforloop.leetcode30daychallenge.DataStructures.ListNode;

/**
 *https://leetcode.com/problems/middle-of-the-linked-list/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3290/
 * */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast.next != null){
            fast = fast.next;
            if(fast.next !=null){
                fast = fast.next;
            }
            slow = slow.next;
        }
        return slow;
    }
}
