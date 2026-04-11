class Solution {
    public int lengthOfLIS(int[] nums) {
        //Using DP O(n^2)
        // int [] dp = new int[nums.length];

        // //Start main pointer
        // for(int i=1;i<nums.length;i++){
        //     //Second pointer
        //     for(int j=0;j<i;j++){
        //         if(nums[i]>nums[j]){
        //             if(dp[j]+1>dp[i]){
        //                 dp[i]=dp[j]+1;
        //             }
        //         }
        //     }
        // }

        // //Finding the max value
        // int maxIndex=0;
        // for(int i=0;i<dp.length;i++){
        //     if(dp[i]>dp[maxIndex]){
        //         maxIndex=i;
        //     }
        // }

        // return dp[maxIndex]+1;

        //Using binary search O(n log N)

        int[] tails = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int left = 0, right = size;

            while (left < right) {
                int mid = (left + right) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = num;

            if (left == size) {
                size++;
            }
        }

        return size;

    }
} 
