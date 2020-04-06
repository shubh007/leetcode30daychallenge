package io.theforloop.leetcode30daychallenge.day6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
/**
 * https://leetcode.com/problems/group-anagrams/
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/
 * */
class GroupAnagramsTest {

    @Test
    void groupAnagramsApproachOne() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] output = {
            {"ate","eat","tea"},
                {"nat","tan"},
                {"bat"}
        };
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> res = groupAnagrams.groupAnagramsApproachOne(input);
        System.out.println(res);
    }

    @Test
    void groupAnagramsApproachTwo() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] output = {
                {"ate","eat","tea"},
                {"nat","tan"},
                {"bat"}
        };
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> res = groupAnagrams.groupAnagramsApproachTwo(input);
        System.out.println(res);
    }
}