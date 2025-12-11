//Leetcode 189. Rotate Array
//Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

class Solution {
    public void rotate(int[] nums, int k) {
           int n = nums.length;
            k = k % n; //To handle the large case

        
        reverse(nums, 0, n - 1); //Reverse the whole array

     
        reverse(nums, 0, k - 1);  //Arranging the rotated first half(rotate the arry)

        reverse(nums, k, n - 1);  //Arranging the second half
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
