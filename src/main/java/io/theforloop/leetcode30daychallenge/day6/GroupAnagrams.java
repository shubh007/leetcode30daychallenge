package io.theforloop.leetcode30daychallenge.day6;

import java.util.*;

/**
 * @author Shubham
 */
public class GroupAnagrams {
    private Map<String,String> cache = new HashMap<>();
    public List<List<String>> groupAnagramsApproachOne(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = sortChars(s);
            List<String> list = map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
    public List<List<String>> groupAnagramsApproachTwo(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = getKeyWord(s);
            List<String> list = map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
    private String sortChars(String word){
        if(cache.containsKey(word)){
            return cache.get(word);
        }
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String val = String.valueOf(arr);
        cache.put(word,val);
        return val;
    }
    private String getKeyWord(String word){
        if(cache.containsKey(word)){
            return cache.get(word);
        }
        int[] count = new int[26];
        int len = word.length();
        for(int i = 0 ; i< len ;i++){
            count[word.charAt(i)-'a']++;
        }
        StringBuilder key = new StringBuilder("#");
        for(int i = 0 ; i< 26 ;i++){
            if(count[i]>0){
                key.append(count[i]);
                key.append(i);
            }
        }
        String val = key.toString();
        cache.put(word,val);
        return val;
    }
}
