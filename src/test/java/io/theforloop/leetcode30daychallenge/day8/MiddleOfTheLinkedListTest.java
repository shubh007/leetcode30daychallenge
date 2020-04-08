package io.theforloop.leetcode30daychallenge.day8;

import io.theforloop.leetcode30daychallenge.DataStructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class MiddleOfTheLinkedListTest {

    @Test
    void middleNodeTest1() {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        ListNode expNode = null;
        for(int i = 2 ; i <=5 ; i++){
            listNode.next = new ListNode(i);
            if(i==3){
                expNode = listNode.next;
            }
            listNode = listNode.next;
        }
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode resNode = middleOfTheLinkedList.middleNode(head);
        while (resNode != null){
            assertNotNull(expNode);
            assertEquals(expNode.val,resNode.val);
            resNode = resNode.next;
            expNode = expNode.next;
        }
    }
    @Test
    void middleNodeTest2() {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        ListNode expNode = null;
        for(int i = 2 ; i <=6 ; i++){
            listNode.next = new ListNode(i);
            if(i==4){
                expNode = listNode.next;
            }
            listNode = listNode.next;
        }
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode resNode = middleOfTheLinkedList.middleNode(head);
        while (resNode != null){
            assertNotNull(expNode);
            assertEquals(expNode.val,resNode.val);
            resNode = resNode.next;
            expNode = expNode.next;
        }
    }
}