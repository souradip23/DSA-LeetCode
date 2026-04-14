class Solution {
    List<List<String>> res = new ArrayList<>();
    int N;
    public List<List<String>> solveNQueens(int n) {
        N=n;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        generate(board, 0);
        return res;
    }
    public void generate(char[][] board, int row) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                list.add(new String(board[i]));
            }
            res.add(list);
            return;
        }
        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                generate(board, row + 1);
                board[row][col] = '.'; 
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col) {
        //top row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for(int i=row,j=col;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q')return false;
        }
         for(int i=row,j=col;i>=0 && j<N ;i--,j++){
            if(board[i][j]=='Q')return false;
        }

        return true;
    }
}