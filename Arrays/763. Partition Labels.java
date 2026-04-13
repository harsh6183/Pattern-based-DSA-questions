import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: store last occurrence of each character
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        
        // Step 2: greedy partitioning
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            
            // If current index reaches end, partition here
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        
        return result;
    }
}
