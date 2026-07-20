class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
     int row = grid.length;
        int col = grid[0].length;

        k = k % (row * col);

        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int oldIndex = i * col + j;
                int newIndex = (oldIndex + k) % (row * col);

                int newRow = newIndex / col;
                int newCol = newIndex % col;

                ans[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < col; j++) {
                temp.add(ans[i][j]);
            }

            list.add(temp);
        }

        return list;
       
    }
}