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
    String smallestString = "";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return smallestString;
    }

    public void dfs(TreeNode root , StringBuilder curString){
        if(root==null){
            return ;
        }
        
       // char ch = root.val + 'a'; //Converting number into char
        curString.insert(0,(char)(root.val+'a'));
        if(root.left==null && root.right ==null){
            if(smallestString ==""|| smallestString.compareTo(curString.toString())>0){
                smallestString = curString.toString();
            }

            return ;
        }

        if(root.left!=null){
            dfs(root.left,curString);
            curString.deleteCharAt(0);
        }
         if(root.right!=null){
            dfs(root.right,curString);
            curString.deleteCharAt(0);
        }
    }
}
