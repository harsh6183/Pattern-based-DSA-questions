//Leetcode 26. Remove Duplicates from Sorted Array
 //Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]

public class RemoveDuplicates {
    class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;

        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[index-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
}
