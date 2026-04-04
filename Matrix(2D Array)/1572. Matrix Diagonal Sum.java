class Solution {
    public int diagonalSum(int[][] mat) {
       int sum =0;
       int n = mat.length;

       //Getting the sum of both the diagonals
       for(int i=0;i<n;i++){
        sum+=mat[i][i];
        sum+=mat[i][n-i-1];//Last index means last number
       } 
        //If the matrix is odd
        //Subtract the duplicate element
        if(n%2!=0){
            sum-=mat[n/2][n/2];//Means is the matrix is of odd n*n then remove the middle because it will repeat when both diagonal will ittrate
        }
        return sum;
    }
}
