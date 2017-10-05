package com.sachin.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NonRepCharApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstNotRepeatingCharacter("abaabadcd"));

	}
	public static char firstNotRepeatingCharacter(String s) {
	    LinkedHashSet<Character> list1 = new LinkedHashSet<Character>();
	    HashSet<Character> found = new HashSet<Character>();
	    for(int i = 0;i<s.length();i++){
	        char curr = s.charAt(i);
	        if(!found.contains(curr)){
	            found.add(curr);
	            list1.add(curr);
	        }
	        else{
	            list1.remove(curr);
	        }
	    }
	    if(!list1.isEmpty())
	        return (char)list1.toArray()[0];
	    else
	        return'_';	        
	}

}
