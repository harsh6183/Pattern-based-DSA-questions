class Solution {
    public int maxSubArray(int[] nums) {
        //To find the maxi sum possible
        int maxSum = nums[0];
        //To store the max found at a position
        int currMax = nums[0];

        for(int i=1;i<nums.length;i++){

            //Equivalent to step 3
            currMax = Math.max(nums[i],nums[i]+currMax);

            //Equivalent to step 4
            maxSum = Math.max(currMax,maxSum);
        }
        return maxSum;
    }
}
