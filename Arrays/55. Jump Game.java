class Solution {
    public boolean canJump(int[] nums) {
        //Greedy algorithm Approach
        // int lastIndex=nums.length-1;
        // for(int i=nums.length-2;i>=0;i--){
        //     if(i+nums[i]>=lastIndex){
        //         lastIndex=i;
        //     }
        // }
        //    return lastIndex==0;

            //TimeCom O(n)
        int maxIndex =0;
        int n=nums.length;
        int i=0;
        while(i<=maxIndex){
            maxIndex=Math.max(i+nums[i],maxIndex);
            if(maxIndex>=(n-1)){
                return true;
            }
            i++;
        }
        return false;

    }
}
