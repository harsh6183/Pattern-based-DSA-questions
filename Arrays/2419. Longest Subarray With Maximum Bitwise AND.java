class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int maxRange=0;
        int currentRange =0;

        for(int i =0; i<nums.length;i++){
            if(nums[i]>maxValue){
                maxValue=nums[i];
                maxRange=1;
                currentRange=1;
            }else if(nums[i]==maxValue){
                currentRange+=1;
            }else {
                currentRange=0;
            }

            maxRange=Math.max(maxRange,currentRange);
        }
        return maxRange;
    }
}
