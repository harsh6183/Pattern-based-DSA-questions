class Solution {
    public int fib(int n) {
        //Solving using recursion
        //Base case
        //Time comp O(2^n)
        // if(n<=1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);

        //DP method Bottom up tabulation
        //Time comp O(n)

        if(n <=1){
            return n;
        }
        
        int dp[] = new int[n+1];

        dp[0]=0;
        dp[1]=1;

        for(int i = 2; i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
