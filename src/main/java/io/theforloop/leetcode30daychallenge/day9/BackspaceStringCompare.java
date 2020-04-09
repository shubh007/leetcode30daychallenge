package io.theforloop.leetcode30daychallenge.day9;

/**
 * @author Shubham
 */

import java.util.Stack;

/**
 *https://leetcode.com/problems/backspace-string-compare/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/
 * */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(int i = 0 ; i <S.length() ; i++){
            char ch = S.charAt(i);
            if(ch == '#'){
                if(!stackS.isEmpty()){
                    stackS.pop();
                }
            }else{
                stackS.push(ch);
            }
        }
        for(int i = 0 ; i <T.length() ; i++){
            char ch = T.charAt(i);
            if(ch == '#'){
                if(!stackT.isEmpty()){
                    stackT.pop();
                }
            }else{
                stackT.push(ch);
            }
        }
        if(stackT.size() != stackS.size()){
            return false;
        }
        while(!stackT.isEmpty()){
            if(stackT.pop() != stackS.pop()){
                return false;
            }
        }
        return true;
    }
}
