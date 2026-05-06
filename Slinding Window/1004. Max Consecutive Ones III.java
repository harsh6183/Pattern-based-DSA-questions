
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCounts = 0;
        int maxOnes = 0;
        //Time comp O(N) space O(1)
        //Using sliding window
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCounts++;
            }

            while (zeroCounts > k) {
                if (nums[start] == 0) {
                    zeroCounts--;
                }
                start++; // always move start
            }

            // updating AFTER window becomes valid
            maxOnes = Math.max(maxOnes, end - start + 1);
        }

        return maxOnes;
    }
}
