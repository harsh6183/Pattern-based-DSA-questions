class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]--;

            // Skip if already used
            if (visited[idx]) continue;

            // Maintain lexicographical order
            while (sb.length() > 0 &&
                   c < sb.charAt(sb.length() - 1) &&
                   freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {

                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            visited[idx] = true;
        }

        return sb.toString();
    }
}
