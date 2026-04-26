class Solution {
  int[] dx = {-1, 1, 0, 0}; // up, down
    int[] dy = {0, 0, -1, 1}; // left, right

    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, visited, i, j, -1, -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited,
                        int x, int y, int parentX, int parentY) {

        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            // Check bounds
            if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length)
                continue;

            // Only move to same character
            if (grid[nx][ny] != grid[x][y])
                continue;

            // If not visited → continue DFS
            if (!visited[nx][ny]) {
                if (dfs(grid, visited, nx, ny, x, y)) {
                    return true;
                }
            }
            // If visited and not parent → cycle found
            else if (nx != parentX || ny != parentY) {
                return true;
            }
        }

        return false;
    }
}