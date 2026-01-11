class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set <Integer> set = new HashSet<>();
         long curSum =0;
        long maxSum=0;
        int left =0;

        //By Using Slinding Window
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);//Removing duplicate present in the set
                curSum-=nums[left];//Shrinking the window
                left++;
            }
            curSum+=nums[right];//Expanding the window
            set.add(nums[right]);
            if(set.size()==k){
                maxSum=Math.max(curSum,maxSum);
            }
        }
        return maxSum;
    }
}
