class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        //Bring front the non zero numbers and fill the first places
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }

        //This loop is to fill the remaining index
        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }
}
