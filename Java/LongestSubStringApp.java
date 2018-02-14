package com.sachin.leetcode;

import java.util.TreeSet;

public class LongestSubStringApp {

    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> lengthSet = new TreeSet<Integer>();
        String currentString;
        for(int i=0; i<s.length(); i++){
            String currentCharStr = Character.toString(s.charAt(i));
            int currentPos = sb.indexOf(currentCharStr);
            if(currentPos > -1){
                lengthSet.add(sb.length());
                sb.delete(0,currentPos+1); 
                sb.append(currentCharStr);
            }
            else{
                sb.append(currentCharStr);
            }
        }
        return Math.max(lengthSet.last(),sb.length());
    }
}
