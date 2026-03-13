class Solution {

    //Time comp O(nxm)
    public int numIslands(char[][] grid) {
        //Base case
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
           return count;

    }

    //Using DFS for traversing to all the land 

    private void dfs(char[][] grid,int i,int j){
        if(i<0|| i>=grid.length ||j<0 ||j>=grid[0].length ||grid[i][j]=='0'){
            return;
        }

        //Once it is check whether it  is visited or not this is use to mark the cell as visited
        grid[i][j]='0';

        //Now next exploring in all four directions if island is present (1 is present) 

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }

}
