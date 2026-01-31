class Solution {
    public int rob(int[] nums) {
        //Same as the House robber question solution 
        //Just here its circle case where last and first house cant be pick
        if(nums.length==1){
            return nums[0];
        }

        int num1[] = new int[nums.length-1];
        int num2[] = new int[nums.length-1];
        int j=0;
        int k=0;

        for(int i =0;i<nums.length;i++){
            if(i!=0){
                num1[j]=nums[i];
                j++;
            }
            if(i!=nums.length-1){
                num2[k]=nums[i];
                k++;
            }
        }
        return Math.max(robLinear(num1),robLinear(num2));
    }
        // Same House Robber I logic
    private int robLinear(int[] nums) {
        int prev1 = 0, prev2 = 0;

        for (int n : nums) {
            int curr = Math.max(prev1, prev2 + n);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
