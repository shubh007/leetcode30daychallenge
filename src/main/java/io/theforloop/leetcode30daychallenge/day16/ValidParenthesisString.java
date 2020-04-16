package io.theforloop.leetcode30daychallenge.day16;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/valid-parenthesis-string/
 *https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3301/
 * */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        return validate(0,0,s.length(),s);
    }
    private boolean validate(int count ,int start,int length,String input){
        if(count < 0){
            return false;
        }
        for(int index = start ; index < length ;index++){
            char currChar = input.charAt(index);
            if(currChar == '('){
                count++;
            }else if(currChar == ')'){
                count--;
                if(count<0){
                    return false;
                }
            }else if(currChar == '*'){
                return validate(count+1,index+1,length,input)
                        || validate(count,index+1,length,input)
                        || validate(count-1,index+1,length,input);
            }
        }
        return count == 0;
    }
}
