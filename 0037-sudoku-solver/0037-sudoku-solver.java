class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isValid(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)) return true;
                            board[i][j]='.'; //backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(char [][] board,int row,int col, char num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
            if(board[i][col]==num) return false;
            //for box
            int r=(row/3)*3+i/3;
            int c=(col/3)*3+i%3;
            if(board[r][c]==num) return false;
        }
        return true;
    }
}