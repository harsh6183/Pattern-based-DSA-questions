class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        //Time complexity O(n^2)
        Set<String> wordSet = new HashSet<>(wordDict);

        int maxLen=0;
        for(String word:wordDict){
            maxLen=Math.max(maxLen,word.length());
        }

        int n=s.length();
        //Dp stated if the substring s[0..i] can be segmented or not
        boolean[]dp=new boolean[n+1];
        //Base case :empty string is valid
        dp[0]=true;
        for(int i=1;i<=n;i++){

            //checks the prefixes of length up to maxLen
            for(int j=i-1;j>=Math.max(0,i-maxLen);j--){
                if(dp[j]&& wordSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break; //No need to check further prefixes
                }
            }
        }
        return dp[n]; //The last one will tell whether it is false or true!
    }
}
