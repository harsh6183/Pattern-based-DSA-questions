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
    public ListNode reversedLL(ListNode node){
            ListNode prev = null;
            ListNode currNode= node;
            while(currNode!=null){
                ListNode nextNode = currNode.next;
                currNode.next=prev;
                prev=currNode;
                currNode=nextNode;
            }
            return prev;
        }
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast =head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p2= reversedLL(slow);
        ListNode p1=head;
        int max = Integer.MIN_VALUE;
        while(p1!=null && p2!=null){
            int candidate= p1.val + p2.val;
            max=Math.max(max,candidate);
            p1=p1.next;
            p2=p2.next;
        }
        return max;
    }
}
