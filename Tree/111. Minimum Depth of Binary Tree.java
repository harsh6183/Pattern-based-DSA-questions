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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int depth=1;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);

        //Level order traversal
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode node =  q.poll();

                //If a leaf node is found just return depth
                if(node.left==null && node.right==null){
                    return depth;
                }

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}

///**
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
    public int minDepth(TreeNode root) {
        int result=0;
        if(root==null){ return 0;}
        Queue<TreeNode> que1= new LinkedList<>();
        que1.offer(root);
        while(!que1.isEmpty()){
            int level = que1.size();
            result++;
            for (int i=0; i<level; i++){
                TreeNode node = que1.poll();
                if(node.left== null && node.right ==null){return result;}
                if(node.left!=null){que1.offer(node.left);}
                if(node.right!=null){que1.offer(node.right);}
            }
        }
        return result;
    }
}
