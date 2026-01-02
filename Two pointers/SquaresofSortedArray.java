class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];

       int i=0;
       int j = nums.length-1;
       int pos=nums.length-1;

       while(i<=j){
        int leftsq= nums[i] * nums[i];
        int rightsq= nums[j] * nums[j];
        
        if(leftsq>rightsq){
            result[pos]=leftsq;
            i++;
        }else{
            result[pos]=rightsq;
            j--;
        }
        pos--;
       }
       return result;
    }
}
