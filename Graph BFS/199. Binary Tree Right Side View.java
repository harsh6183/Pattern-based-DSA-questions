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
    public List<Integer> rightSideView(TreeNode root) {
        
        //Approach is using the Level order traversal that is BFS
        //Using this the last most integer (node) is to return in the result

        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        //BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();

                //LastNode of the level
                if(i==size-1){
                    result.add(node.val);
                }

                //Left node has the child then add to queue
                if(node.left!=null){
                    queue.offer(node.left);
                }

                //Right node has the child then add to queue
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }
}
