class Solution {
    public void solve(char[][] board) {

    //Time comp O(nxm)
        //Base case
        if(board==null || board.length==0 || board[0].length==0){
            return ;
        }

         // DFS only from borders
        for(int i = 0; i < board.length; i++){
            dfs(board, i, 0);
            dfs(board, i, board[0].length-1);
        }

        for(int j = 0; j < board[0].length; j++){
            dfs(board, 0, j);
            dfs(board, board.length-1, j);
        }

        //Converting surrounded regions with X
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                 if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }

                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    //Using DFS for traversing to all the land 

    private void dfs(char[][] board,int i,int j){
            if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O'){
            return;
        }

        //Once it is check whether it  is visited or not this is use to mark the cell as visited
        board[i][j]='#';

        //Now next exploring in all four directions if island is present (1 is present) 

        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);

    }

}
