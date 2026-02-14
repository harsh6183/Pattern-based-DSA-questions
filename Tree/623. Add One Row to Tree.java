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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newRoot = null;
        if(depth==1){
            newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        dfs(root,1,depth,val);
        return root;
    }

    public void dfs(TreeNode root,int curDepth, int depth, int val){
        //base case
        if(root ==null){
            return ;
        }

        //find insertion point
        if(curDepth==depth-1){
            TreeNode newLeft = new TreeNode (val);
            newLeft.left=root.left;
            root.left=newLeft;

            TreeNode newRight = new TreeNode (val);
            newRight.right=root.right;
            root.right=newRight;
            return ;
        }

        dfs(root.left,curDepth+1,depth,val);
        dfs(root.right,curDepth+1,depth,val);
    }
}
