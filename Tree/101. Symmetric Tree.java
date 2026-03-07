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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

        Queue<TreeNode> leftTree = new LinkedList<> ();
        Queue<TreeNode> rightTree = new LinkedList <>();
        
        leftTree.add(root.left);
        rightTree.add(root.right);

        //BFS or leve order traversal

        while(!leftTree.isEmpty() && !rightTree.isEmpty()){
            TreeNode leftNode =leftTree.poll();
            TreeNode rightNode =rightTree.poll();

            if(leftNode==null && rightNode ==null) continue;
            if(leftNode==null || rightNode ==null) return false;
            if(leftNode.val!= rightNode.val) return false;

            //Pushing order 
            leftTree.add(leftNode.left);
            leftTree.add(leftNode.right);
            rightTree.add(rightNode.right);
            rightTree.add(rightNode.left);

        }
            return true;
    }
}




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
    public boolean isSymmetric(TreeNode root) {
        return tree(root,root);
    }
    public boolean tree(TreeNode i,TreeNode k){
         if(i==null && k==null){
            return true;
         }
         else if (i == null || k == null){
            return false;
         }
         else if(i.val !=k.val){
            return false;
         }
         return tree(i.left,k.right)&& tree(i.right,k.left);

    }
}
