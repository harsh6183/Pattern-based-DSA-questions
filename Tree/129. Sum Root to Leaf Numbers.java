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
    int sum =0;
    public int sumNumbers(TreeNode root) {
        
        getRootSum(root,0);
        return sum;
    }

    public void getRootSum(TreeNode root,int curNum){
        if(root==null){
            return ;
        }

        curNum=curNum*10+root.val; //This was the imp step to convert the number for getting the sum
        if(root.left==null && root.right==null){
            sum+=curNum;
            return ;
        }

        //DFS recursion call 
        //Left call
        getRootSum(root.left,curNum);
        
        //right call
        getRootSum(root.right,curNum);
    }
}
