// Leetcode 80. Remove Duplicates from Sorted Array II
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
public class RemoveDuplicatesSortedArray2 {
    class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;

        int index=0;
        for(int n:nums){
            if(index<2 || n!=nums[index-2]){
                nums[index++]=n;
            }
        }
        return index;
    }
}
}
