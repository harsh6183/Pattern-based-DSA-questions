/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = sortedArrayToBSThelper(nums,0,nums.length-1);
        return root;
    }

     public TreeNode sortedArrayToBSThelper(int[] nums, int start, int end) {
        if(start>end){
            return null; //Base case
        }

        int mid = start + (end-start)/2;
        int nodeVal = nums[mid];
        TreeNode node = new TreeNode(nodeVal);

        //To build left subtree
        node.left= sortedArrayToBSThelper(nums,start,mid-1);
        
        //To build right subtree
        node.right= sortedArrayToBSThelper(nums,mid+1,end);

        return node;
    }
}
