class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int secondMax=-1;
        int maxIndex=0;

        for(int i=0; i<nums.length;i++){

            //Got the max and secondMax number and stored
            if(nums[i]>max){
                secondMax=max;
                max=nums[i];
                maxIndex=i;
            }else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        //Now return
        return max>=2*secondMax?maxIndex:-1;
    }
}
