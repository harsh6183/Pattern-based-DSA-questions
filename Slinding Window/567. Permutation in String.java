class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(m<n) return false;
        
        int map1[] = new int[26];
        int map2[] = new int[26];

        //Using sliding window where the fixed range of s1 string can be taken

        for(int i=0;i<n;i++){
            map1[s1.charAt(i)-'a']++; //This is to get the character count so that after comparing the count we can return the answer
            map2[s2.charAt(i)-'a']++;
        }
        //Initial window case
        if(isMatched(map1,map2)){
            return true;
        }

        for(int i=1;i<=m-n;i++){
            map2[s2.charAt(i-1)-'a']--; // remove left char  This is shrinking (Deletion)
            map2[s2.charAt(i+n-1)-'a']++; // add new right char(Expansion)

            if(isMatched(map1,map2)){
                 return true;
            }
        }
            return false; 
    }

    private boolean isMatched(int[] map1,int[] map2){
        for(int i =0;i<26;i++){
            
            if(map1[i]!=map2[i]) return false;
        }
        return true;
    }
}
