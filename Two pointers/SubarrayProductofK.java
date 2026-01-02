class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

         if (k <= 1) return 0;
        
        int n = nums.length;
        int start = 0;
        int end =0;
        int count =0;
        int product =1;
        while(end<n){
            //Using sliding window 
            //Expansion
            product=product*nums[end];

            //shrinking
            while(product>=k){
                product = product/nums[start];
                start++;
            }
            count = count + (end-start+1);
            end++;
        }
        return count ;
    }
}
