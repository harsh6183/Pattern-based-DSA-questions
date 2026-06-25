public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        // Loop through each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int foundIndex = -1;
            
            // Step 1: Find the position of current element in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == current) {
                    foundIndex = j;
                    break;
                }
            }
            
            int nextGreater = -1;
            // Step 2: Search to the right of foundIndex in nums2
            for (int k = foundIndex + 1; k < nums2.length; k++) {
                if (nums2[k] > current) {
                    nextGreater = nums2[k];
                    break; // Stop at the first greater element
                }
            }
            
            result[i] = nextGreater;
        }
        
        return result;
    }
}
