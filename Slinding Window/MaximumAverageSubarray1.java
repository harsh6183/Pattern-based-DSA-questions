class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Using Slinding window
        double max =0;
        double sum =0;

        for(int i =0;i<k;i=i+1){
            sum=sum+nums[i]; 
        }
         max=sum;
       

        //Applying window technique

        for(int j =k;j<nums.length;j=j+1){
            sum=sum+nums[j];//Expanding the window size
            sum=sum-nums[j-k]; //Shrinking the window size
            max=Math.max(max,sum);//Updating the max
        }
        return max/k; //Returning max avg
    }
}
