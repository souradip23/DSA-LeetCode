class Solution {
    static void dfs(int r,int c,char [][] grid){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        //top
        dfs(r-1,c,grid);
        //bottom
        dfs(r+1,c,grid);
        //left
        dfs(r,c-1,grid);
        //right
        dfs(r,c+1,grid);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
}