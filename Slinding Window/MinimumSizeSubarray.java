class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curSum =0;
        int left =0;
        int minLength=Integer.MAX_VALUE;

        for(int right =0;right<nums.length;right++){
            curSum=curSum+nums[right];
           
            while(curSum>=target){
                if(right-left+1< minLength){
                    minLength=right-left+1;
                }
                curSum-=nums[left];
                left++;
            }
        }
        return minLength!=Integer.MAX_VALUE?minLength:0;
    }
}
