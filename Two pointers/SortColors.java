class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        //Dutch National Flag Algorithm
        while (mid <= high) {
            if (nums[mid] == 0) {
                //  0s at the beginning
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1s stay in the middle
                mid++;
            } else {
                // nums[mid] == 2,  2s at the end
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
