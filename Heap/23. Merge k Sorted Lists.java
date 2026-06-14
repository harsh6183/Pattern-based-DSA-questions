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
 //Time Comp NLogK space comp O(K)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         // Step 1: Handle edge cases
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        // Step 2: Initialize Min-Heap based on node values
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        // Step 3: Add the head of each non-empty linked list to the heap
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.add(head);
            }
        }
        
        // Step 4: Create a dummy node to build the result list easily
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Step 5: Process elements until the heap is empty
        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll(); // Get the node with the smallest value
            current.next = smallestNode;           // Connect it to our output list
            current = current.next;                // Advance the current pointer
            
            // If there's a next node in the extracted list, push it to the heap
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }
        
        return dummy.next; // Return the actual head of the merged list
    }
}

//Brute force TC NlogN
// public class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         // Step 1: Handle edge cases
//         if (lists == null || lists.length == 0) {
//             return null;
//         }

//         // Step 2: Extract all values from all the linked lists
//         List<Integer> allValues = new ArrayList<>();
//         for (ListNode head : lists) {
//             ListNode current = head;
//             while (current != null) {
//                 allValues.add(current.val);
//                 current = current.next;
//             }
//         }

//         // Step 3: If all lists were empty, return null
//         if (allValues.isEmpty()) {
//             return null;
//         }

//         // Step 4: Sort the extracted values
//         Collections.sort(allValues);

//         // Step 5: Convert the sorted array back into a linked list
//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;
//         for (int value : allValues) {
//             current.next = new ListNode(value);
//             current = current.next;
//         }

//         return dummy.next;
//     }
// }
