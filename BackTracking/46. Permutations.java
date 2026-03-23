class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        
        backtrack(nums, result, new ArrayList<>(), used);
        return result;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> result, 
                           List<Integer> current, boolean[] used) {
        
        // Base case: permutation complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // Skip if already used
            if (used[i]) continue;
            
            // Choose
            current.add(nums[i]);
            used[i] = true;
            
            // Explore
            backtrack(nums, result, current, used);
            
            // Undo (Backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
