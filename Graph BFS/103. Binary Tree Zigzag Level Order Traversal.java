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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        //Same approach as the que 102 and 637 based on BFS

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //Making the flag so that to add the value in list in zigzag manner
        boolean leftToRight = true;

        while(!queue.isEmpty()){

            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for(int i=0;i<size;i++){

                TreeNode node = queue.poll();

                if(leftToRight){
                    level.addLast(node.val);
                }else{
                    level.addFirst(node.val);
                }

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            result.add(level);
            
            leftToRight = !leftToRight;//IMP This is just to switching the  direction after every level
            
//             boolean leftToRight = true;

// leftToRight = !leftToRight;  // becomes false
// leftToRight = !leftToRight;  // becomes true again
        }

        return result;
    }
}
