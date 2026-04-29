class Solution {
    static int original;
   static  void dfs(int [][]image,int sr,int sc,int m,int n,int color){
        if( sr>=m || sc>=n || sr<0 || sc<0){
            return;
        }
        if(original!=image[sr][sc])return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,m,n,color);
        dfs(image,sr-1,sc,m,n,color);
        dfs(image,sr,sc+1,m,n,color);
        dfs(image,sr,sc-1,m,n,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        original=image[sr][sc];
        if(original!=color){
             dfs(image,sr,sc,m,n,color);
        }
    return image;
    }
}