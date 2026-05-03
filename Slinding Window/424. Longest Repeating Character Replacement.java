class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0;
        int maxFreq=0;
        int maxWindow=0;

        //Using sliding window

        for(int right=0;right<s.length();right++){
            //Updating the freq of the current character
            freq[s.charAt(right)-'A']++;

            //Updating the maxFrequency
            maxFreq= Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int windowLength=right-left+1; //This is length of the substring

            //If the windowLength-maxFreq>k then we need to shrink the window
            if(windowLength-maxFreq>k){
                freq[s.charAt(left)-'A']--; //shrinking
                left++;// Expansion
            }
            windowLength=right-left+1;
            maxWindow=Math.max(maxWindow,windowLength);
        }
        return maxWindow;
    }
}
