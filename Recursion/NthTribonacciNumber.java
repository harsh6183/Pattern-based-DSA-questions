class Solution {
    //  Map<Integer,Integer> map = new HashMap<>();

    // public int tribonacci(int n) {
    //     //Recursion method
       
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1 || n==2){
    //         return 1;
    //     }
        
    //     if(map.containsKey(n)){
    //         return map.get(n);
    //     }

    //     map.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
    //     return map.get(n);

    public int tribonacci(int n) {

        //Using DP

        int[] dp = new int[n+1];
        if(n==0){
            return 0;
        }

        if(n==1 || n==2){
            return 1;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=n;i=i+1){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
