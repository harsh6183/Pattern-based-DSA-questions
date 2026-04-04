class Solution {
    public int rob(int[] nums) {
        //Same as the House robber question solution 
        //Just here its circle case where last and first house cant be pick
        if(nums.length==1){
            return nums[0];
        }

        int skipLastHouse[] = new int[nums.length-1];
        int skipFirstHouse[] = new int[nums.length-1];

        for(int i =0;i<nums.length-1;i++){
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
        }

        //Getting the total loot from both the possiblities
        int lootSkippingtheLast=robLinear(skipLastHouse);
        int lootSkippingtheFirst = robLinear(skipFirstHouse);

        return Math.max(lootSkippingtheLast, lootSkippingtheFirst);
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
