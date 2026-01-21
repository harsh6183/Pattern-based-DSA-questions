class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] freq = new int[1001]; // constraint based
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums1)
            freq[n]++;

        for (int n : nums2) {
            if (freq[n] > 0) {
                list.add(n);
                freq[n]--;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
