class Solution {
    public boolean isValidSudoku(char[][] board) {
    //     //Creating HashSet to store the unquie values and then check if it present or not

    // //This creates an array of size 9, where each element will hold a HashSet<Character>
    //     HashSet<Character>[] rows = new HashSet[9];
    //     HashSet<Character>[] cols = new HashSet[9];
    //     HashSet<Character>[] boxes = new HashSet[9];


    //     //Now here Initializing the sets
    //     for(int i=0;i<9;i++){
    //         rows[i]=new HashSet<>();
    //         cols[i]=new HashSet<>();
    //         boxes[i]=new HashSet<>();
    //     }

    //     //Checking the actual char 

    //     for(int r=0;r<9;r++){
    //         for(int c=0;c<9;c++){

    //             char val = board[r][c];
    //             if(val=='.') continue;

    //             //Boxes identification
    //             int boxIndex = (r / 3) * 3 + (c / 3);

    //             //Checking the duplicates
    //             if(rows[r].contains(val) ||cols[c].contains(val) || boxes[boxIndex].contains(val)){
    //                 return false;
    //             }

    //             //Else Add values

    //             rows[r].add(val);
    //             cols[c].add(val);
    //             boxes[boxIndex].add(val);
    //         }
    //     }


    //     return true;


    //More optimal solution 
     boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') continue;

                int num = board[r][c] - '1'; // map '1'-'9' → 0-8
                int boxIndex = (r / 3) * 3 + (c / 3);

                // Check if already seen
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark as seen
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
