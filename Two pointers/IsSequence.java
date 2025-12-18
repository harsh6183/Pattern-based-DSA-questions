//Leetcode 392. Is Subsequence
// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i=0;

        for(int j=0;j<m && i<n;j++ ){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==s.length();
    }
}
