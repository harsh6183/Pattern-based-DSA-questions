//Leetcode 28. Find the Index of the First Occurrence in a String
/*Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.*/
class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int m = needle.length();

       for(int i =0; i<=n-m;i++){
        int j =0;
        while(j<m && haystack.charAt(i+j) == needle.charAt(j)){
            j++;
        }
        if(j==m){
            return i;
        }
       }
       return -1;
    }
}

//Approach 2
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
