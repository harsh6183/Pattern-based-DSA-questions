class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
       // Step 1: XOR all indices + n
       //0 ^ 1 ^ 2 ^ 3
      //Step 2: XOR all array elements
      //3 ^ 0 ^ 1
     

        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
             //Step 3: Combine everything
            //(0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1)
            //= (0 ^ 0) ^ (1 ^ 1) ^ (3 ^ 3) ^ 2 = 2
        }
        
        return xor;
    }
}
