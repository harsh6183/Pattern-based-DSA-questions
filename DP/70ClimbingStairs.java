class Solution {
    public int climbStairs(int n) {
        //Using dp bottom up approach
        //Base case
        
        if(n<=2){
            return n;
        }

        int dp[] = new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int state =3 ; state<=n;state++){
            dp[state]= dp[state-1]+dp[state-2];
        }
        return dp[n];
    }
}
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1; 
        int prev2 = 1; 
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
