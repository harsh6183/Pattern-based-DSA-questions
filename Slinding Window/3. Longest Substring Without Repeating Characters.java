class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength= 0;
        int left=0;

        Set<Character> set= new HashSet<>();

        //Start pointer and end pointer at the same point
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));   //If the ch is repeated the removing the right ch and increasing the leftpointer
                left++;
            }

            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }

        return maxLength;
    }
}
