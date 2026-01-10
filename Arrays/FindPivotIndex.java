class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        
        //Calculating RightSum first
        for(int i=0; i<nums.length;i++){
            rightSum+=nums[i];
        }

        //Now leftSum
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum-nums[i]){
                return i;///Basically returning the index whose leftSum and righSum is equal
            }
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return -1;
    }
}
