class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
         int m = grid.length;
        int n = grid[0].length;

        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;

        // Process each layer from outside to inside
        while (top < bottom && left < right) {
            // Number of elements in this layer's ring
            int len = 2 * (bottom - top + 1) + 2 * (right - left + 1) - 4;
            int rot = k % len; // effective rotations

            // Rotate this ring rot times
            for (int r = 0; r < rot; r++) {
                int topLeft = grid[top][left];

                // move top row left -> right
                for (int j = left; j < right; j++) {
                    grid[top][j] = grid[top][j + 1];
                }

                // move right column top -> bottom
                for (int i = top; i < bottom; i++) {
                    grid[i][right] = grid[i + 1][right];
                }

                // move bottom row right -> left
                for (int j = right; j > left; j--) {
                    grid[bottom][j] = grid[bottom][j - 1];
                }

                // move left column bottom -> top
                for (int i = bottom; i > top; i--) {
                    grid[i][left] = grid[i - 1][left];
                }

                grid[top + 1][left] = topLeft;
            }

            // shrink to inner layer
            top++;
            left++;
            bottom--;
            right--;
        }

        return grid;
    }
}