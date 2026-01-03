class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
         List<Integer> res = new ArrayList<>();
        if (words.length == 0) return res;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

        // Step 1: store frequency of words
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Step 2: we run sliding window for each offset
        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();

            // Move right pointer in wordLen jumps
            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);

                // If valid word, process it
                if (map.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // If word frequency exceeds, shrink from left
                    while (seen.get(word) > map.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // If window matches all words, record index
                    if (count * wordLen == totalLen) {
                        res.add(left);
                        // Slide one word from left for next possible window
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }
                } 
                // If invalid word, reset window
                else {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return res;
    }
}
