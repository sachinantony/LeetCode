package com.sachin.leetcode;

public class AddTwoNumApp {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        int carry = 0;
	        int sum = 0;
	        ListNode outPut = null;
	        ListNode currentNode = null;
	        while(l1 != null || l2 != null){
	            if(l1 != null && l2 != null){
	                sum = l1.val +l2.val + carry;            
	            }
	            else if(l1!=null){
	                sum = l1.val + carry;            
	            }
	            else{
	                sum = l2.val + carry;
	            }
	            if(sum > 9){
	                carry = 1;
	                sum = sum - 10;
	            }                
	            else
	                carry = 0;
	            
	            if(currentNode == null){
	                outPut = new ListNode(sum);     
	                currentNode = outPut;
	            }
	            else{
	                currentNode.next = new ListNode(sum);
	                currentNode = currentNode.next;    
	            }
	            if(l1!=null)
	                l1 = l1.next;
	            if(l2!=null)
	                l2 = l2.next;
	        }
	        if(carry > 0){
	            currentNode.next = new ListNode(carry);
	        }
	        return outPut;
	    }
}
