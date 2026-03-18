class Solution {
    static void bfs(int start, boolean[] visited,List<List<Integer>> rooms){
        visited[start]=true;
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()){
            int node =queue.poll();
            for(int nei : rooms.get(node)){
               if(!visited[nei]){
                 visited[nei]=true;
                queue.offer(nei);
               }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited =new boolean[n];
        visited[0]=true;
        bfs(0,visited,rooms);
        for(boolean ele: visited){
            if(ele==false)return false;
        }
       return true; 
    }
}