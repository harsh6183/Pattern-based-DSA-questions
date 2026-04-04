class Solution {
    public int rob(int[] nums) {  
     if(nums==null || nums.length==0){
        return 0;
     } 
     if(nums.length==1){
        return nums[0];
     } 
     
     //DP and memoization
     int[] dp =new int [nums.length];
     dp[0]=nums[0];
     dp[1]=Math.max(nums[0],nums[1]);   //Edge case when there is only 2house

     for(int i=2;i<nums.length;i=i+1){
         //Storing max of alternate house consideration
        dp[i]=Math.max(nums[i]+ dp[i-2],dp[i-1]);  //suppose 2 4 3 then adding 2+3 and comparing with 4 and returing max .
     } 
     return dp[nums.length-1]; // Finally the last value will be the maximum value.
    }
}
