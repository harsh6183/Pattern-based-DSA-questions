
class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root = new TrieNode();

    // Insert word into Trie
    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';//Thie means a-a=0 index   b-a=1 index....97-97=0 & 98-97=2 asci values
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    // Find shortest root for a word
    private String findRoot(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (node.children[idx] == null) {
                return word; // no root found
            }

            prefix.append(c);
            node = node.children[idx];

            if (node.isEnd) {
                return prefix.toString(); // shortest root found
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        // Build Trie
        for (String rootWord : dictionary) {
            insert(rootWord);
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(findRoot(word)).append(" ");
        }

        return result.toString().trim();
    }
}
