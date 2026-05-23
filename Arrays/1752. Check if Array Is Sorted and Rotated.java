class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            //For the circular comparison
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            //More then 1 break
            if(count >1){
                return false;
            }
        }
        return true;
    }

}
// Dry Run
// Input
// nums = [3,4,5,1,2]
// Comparisons
// i = 0
// 3 > 4 ? no
// i = 1
// 4 > 5 ? no
// i = 2
// 5 > 1 ? yes
// count = 1
// i = 3
// 1 > 2 ? no
// i = 4

// Circular check:

// 2 > 3 ? no

// Only one break → return true.
