class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m=mat.length;
        int n=mat[0].length;
        boolean is0=true;
        boolean is90=true;
        boolean is180=true;
        boolean is270=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){

                if(mat[i][j]!=target[i][j]){
                    is0=false;
                }
                if(mat[i][j]!=target[j][n-i-1]){
                    is90=false;
                }
                if(mat[i][j]!=target[n-i-1][n-j-1]){
                    is180=false;
                }
                if(mat[i][j]!=target[n-j-1][i]){
                    is270=false;
                }
            }
        }
    return is0 || is90 || is180 || is270;
    }
}