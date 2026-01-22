class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      //Time comp O(n)

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        // bucket[i] = list of numbers appearing i times
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (bucket[f] == null)
                bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) break;
                }
            }
        }

        return res;
    }
}
