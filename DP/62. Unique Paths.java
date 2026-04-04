class Solution {
    public int uniquePaths(int m, int n) {
        //Using DP and memoization technique
        int[][] dp= new int[m][n];

        //Iterate over the grid
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                //If we are at the first row or first column
                //There is only one way to reach the cell
                if((i==0 || j==0)){
                    dp[i][j]=1;
                }else{
                    //Memoize the number of ways to reach that cell
                    dp[i][j]=dp[i][j-1] + dp[i-1][j]; //Prev row+prev col
                }
            }
        }
        //returning the number of ways to reach the last cell
        return dp[m-1][n-1];

    }
}
