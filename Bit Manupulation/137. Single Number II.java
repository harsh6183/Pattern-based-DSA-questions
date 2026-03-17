class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        // ones → stores bits that appeared once
        // twos → stores bits that appeared twice
        // When a bit appears 3rd time, it gets removed from both

        
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        // ones contains the number that appeared only once
        return ones;
    }
}
