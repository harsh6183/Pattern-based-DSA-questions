class Solution {
    public void rotate(int[][] matrix) {
        //Using the concept of transpose of matrix  ex: m[i][j]=m[j][i]
        //Next after transpose then only reverse the position and the final rotated matrix will be formed
        //Input:
            // 1 2 3
            // 4 5 6
            // 7 8 9

            // After transpose:
            // 1 4 7
            // 2 5 8
            // 3 6 9

            // After reversing rows: Result
            // 7 4 1
            // 8 5 2
            // 9 6 3

            int n = matrix.length;

            //Transpose
            for(int i=0;i<n;i++){
                for(int j =i;j<n;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }

            //Reversing now each row 
            for(int i=0;i<n;i++){
                int left=0; 
                int right=n-1;

                while(left<right){
                    int temp=matrix[i][left];
                    matrix[i][left]=matrix[i][right];
                    matrix[i][right]=temp;
                    left++;
                    right--;
                }
            }
    }
}
