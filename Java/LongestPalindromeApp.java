package com.sachin.leetcode;

public class LongestPalindromeApp {
	static int max = 0,maxLo=0;
	private static Boolean[][] memo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babaabbaad"));
	}
	
	//By dynamic programming method
	public static String longestPalindromeDP(String s) {
		if(s==null || s.length()<=1)
	        return s;
		
        int len = s.length();
        String res = "";
        int max = 1;
        boolean [][] table = new boolean[len][len];
        for(int l = 0;l<len;l++) {
        	for(int i = 0;i<len-l;i++) {
        		int j = i+l;
        		if(s.charAt(i)==s.charAt(j) && ((j-i<=2)|| table[i+1][j-1])) {
        			table[i][j] = true;
        			if(j-i+1>max) {
        				max = j-i+1;
        				res = s.substring(i, j+1);
        			}
        		}
        	}        	
        }
        return res;
	}
	
	//By expanding by the centre
	public static String longestPalindrome(String s) {
		int start = 0,end = 0;
		for(int i = 0;i<s.length();i++) {
			expandByCenter(s,i,i);
			expandByCenter(s, i, i+1);
		}		
		return s.substring(maxLo, maxLo+max);
	}
	
	public static void expandByCenter(String s, int left,int right) {
		int len = s.length();
		while(left>=0 &&right<len && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		int len2 =  right - left - 1;
		if(len2>max) {
			max = len2;
			maxLo = left+1;
		}
	}
}
