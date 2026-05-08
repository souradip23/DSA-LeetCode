class Solution {

    private boolean hasCycle(int node, List<List<Integer>> adj, int[] visited) {
        visited[node] = 1; // visiting
        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 1) {     // back edge → cycle
                return true;
            }
            if (visited[neighbor] == 0 && hasCycle(neighbor, adj, visited)) {
                return true;
            }
        }
        visited[node] = 2; // visited
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]); 
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (hasCycle(i, adj, visited)) {
                    return false;
                }
            }
        }
        return true;
    }
}