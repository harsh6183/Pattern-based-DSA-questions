/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
       ListNode ptr = result;

       int carry =0;

       while (l1!=null || l2!= null){
        int sum =0+ carry;

        if(l1!=null){ //Using the number from first list
            sum+=l1.val;
            l1=l1.next;
        }

        if(l2!=null){ //Using the number from the second list
            sum+=l2.val;
            l2=l2.next;
        }

        //Now getting the sum and carry
        carry=sum/10; //if sum is 18 then carry = 18/10 =1
        sum=sum%10;  //if sum is 18 then 18%10=8

        ptr.next =new ListNode(sum);
        ptr=ptr.next;

       } 

       if(carry==1)ptr.next = new ListNode(1);
       return result.next;
    }
    
}
