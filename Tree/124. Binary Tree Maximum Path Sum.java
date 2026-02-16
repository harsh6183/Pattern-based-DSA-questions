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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode node ){
        if(node==null){
            return 0;
        }

            //DFS POST ORDER TRAVERSAL
            //Taken 0 to ignore the negative value
        int left= Math.max(0,dfs(node.left));
        int right= Math.max(0,dfs(node.right));

        int curPath=node.val+left+right;

        //Update the global value that is max
        maxSum = Math.max(maxSum,curPath);


        //To get the singlepath or (best path) this step is imp and imp step of whole solution
        return node.val + Math.max(left,right);
    }
    
}
