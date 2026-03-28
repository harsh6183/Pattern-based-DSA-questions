import java.util.*;

class Solution {
    public int minCost(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: frequency difference
        for (int x : nums1)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for (int x : nums2)
            map.put(x, map.getOrDefault(x, 0) - 1);

        int imbalance = 0;

        // Step 2: check validity + count imbalance
        for (int val : map.values()) {
            if (val % 2 != 0) return -1;
            imbalance += Math.abs(val);
        }

        // Step 3: each swap fixes 2 from nums1 + 2 from nums2
        return imbalance / 4;
    }
}
