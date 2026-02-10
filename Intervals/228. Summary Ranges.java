class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) return result;

        int i = 0;
        while (i < n) {
            int start = nums[i];

            // moving while numbers are consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            // form the range
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }

            i++;
        }

        return result;
    }
}
