class Solution {
      static  void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> res) {
        path.add(node);
        if (node == graph.length - 1) {
            res.add(new ArrayList<>(path));
        } else {
            for (int next : graph[node]) {
                dfs(next, graph, path, res);
            }
        }
        path.remove(path.size() - 1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(0,graph,path,res);
        return res;
    }
}