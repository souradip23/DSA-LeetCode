class Solution {
    static void bfs(int start, int[][] adj, boolean[] visited) {
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int j = 0; j < adj.length; j++) {
                if (adj[node][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.offer(j);
                }
            }
        }

    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, adj, visited);
                count++;
            }
        }
        return count;
    }
}