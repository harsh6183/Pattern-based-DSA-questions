class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dirs = {-1, 0, 1};

        // Step 1: Traverse board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                // Check 8 neighbors
                for (int x : dirs) {
                    for (int y : dirs) {
                        if (x == 0 && y == 0) continue;

                        int ni = i + x;
                        int nj = j + y;

                        if (ni >= 0 && nj >= 0 && ni < m && nj < n) {
                            if (Math.abs(board[ni][nj]) == 1) {
                                liveNeighbors++;
                            }
                        }
                    }
                }

                // Apply rules
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = -1; // live → dead
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 2; // dead → live
                    }
                }
            }
        }

        // Step 3: Final update
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                if (board[i][j] == 2) board[i][j] = 1;
            }
        }
    }
}
