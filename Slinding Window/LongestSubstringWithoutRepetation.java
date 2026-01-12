class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxLength= 0;
        // int left=0;

        // Set<Character> set= new HashSet<>();

        // //Start pointer and end pointer at the same point
        // for(int right=0;right<s.length();right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));   //If the ch is repeated the removing the right ch and increasing the leftpointer
        //         left++;
        //     }

        //     set.add(s.charAt(right));
        //     maxLength=Math.max(maxLength,right-left+1);
        // }

        // return maxLength;


        //Another Sliding window solution

        int maxLength=0;
        int i =0;
        int j =0;

        Set<Character> set = new HashSet<>();

        while( j<s.length()){
            char c = s.charAt(j);

            while(set.contains(c)){
                set.remove(s.charAt(i));
                i=i+1;
            }
            set.add(c);
            maxLength=Math.max(maxLength,j-i+1);
            j=j+1;
        }

        return maxLength;
    }
}
