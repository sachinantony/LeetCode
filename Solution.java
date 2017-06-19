/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null,currentNode = null,newNode = null;
        int carry  = 0;
        do{
            int sum, l1Val,l2Val; 
            boolean l1Present,l2Present;
            
            if(l1 != null){
                l1Val = l1.val;
            }
            else{
                l1Val = 0;
            }
            
            if(l2 != null){
                l2Val = l2.val;
            }
            else{
                l2Val = 0;
            }
            
            sum= l1Val + l2Val + carry;
            if(sum >9){
                carry = 1;
                sum -= 10;
            }
            else{
                carry = 0;
            }
            if(currentNode != null){
                newNode = new ListNode(sum);
                currentNode.next = newNode;
                currentNode = newNode;
            }
            else{
                currentNode = new ListNode(sum);
                l3 = currentNode;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            
            
            
        }while(l1 != null || l2 != null || carry != 0);
        return l3;
        
    }
}