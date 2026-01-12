class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Using slinding window.............K is the Index (Index condition)
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<Math.min(k,nums.length);i=i+1){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        for(int j=k;j<nums.length;j=j+1){
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);//Expanding window
            set.remove(nums[j-k]);//Shrinking the window size
        }
        return false;
    }
}
