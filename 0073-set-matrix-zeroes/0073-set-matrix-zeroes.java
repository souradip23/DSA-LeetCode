class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] res = new int[r][c];

        // Copy original matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                if(matrix[i][j]==0){

                    for(int k=0;k<c;k++){
                        res[i][k] = 0;
                    }

                    for(int k=0;k<r;k++){
                        res[k][j] = 0;
                    }
                }

            }
        }

        // Copy result back
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}