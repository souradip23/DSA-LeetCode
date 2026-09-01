class Solution {

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int[][] litterId = new int[m][n];

        int startR = 0;
        int startC = 0;
        int litterCount = 0;

        // Find S and assign IDs to L
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                char ch = classroom[r].charAt(c);

                if (ch == 'S') {
                    startR = r;
                    startC = c;
                }

                else if (ch == 'L') {
                    litterId[r][c] = litterCount;
                    litterCount++;
                }
            }
        }

        // No litter
        if (litterCount == 0) {
            return 0;
        }

        // All litter is initially uncollected
        int initialMask = (1 << litterCount) - 1;

        /*
         * visited[row][col][energy][mask]
         */
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << litterCount];

        Queue<int[]> queue = new LinkedList<>();

        // row, col, remainingEnergy, mask
        queue.offer(new int[]{
                startR,
                startC,
                energy,
                initialMask
        });

        visited[startR][startC][energy][initialMask] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Process one BFS level
            while (size-- > 0) {

                int[] state = queue.poll();

                int r = state[0];
                int c = state[1];
                int currentEnergy = state[2];
                int mask = state[3];

                // All litter collected
                if (mask == 0) {
                    return moves;
                }

                // Can't move without energy
                if (currentEnergy == 0) {
                    continue;
                }

                for (int d = 0; d < 4; d++) {

                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    // Outside grid
                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    // Moving costs one energy
                    int newEnergy = currentEnergy - 1;

                    // Reset cell
                    if (classroom[nr].charAt(nc) == 'R') {
                        newEnergy = energy;
                    }

                    int newMask = mask;

                    // Litter cell
                    if (classroom[nr].charAt(nc) == 'L') {

                        int id = litterId[nr][nc];

                        // Remove this litter from remaining mask
                        newMask &= ~(1 << id);
                    }

                    // New state
                    if (!visited[nr][nc][newEnergy][newMask]) {

                        visited[nr][nc][newEnergy][newMask] = true;

                        queue.offer(new int[]{
                                nr,
                                nc,
                                newEnergy,
                                newMask
                        });
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}