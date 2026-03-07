class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<vector<int>>ans=matrix;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                if(matrix[i][j]==0){
                    int row=i;
                    int col=j;
                    
                    for(int k=0;k<matrix[0].size();k++){
                      ans[row][k]=0;
                    }
                    for(int k=0;k<matrix.size();k++){
                        ans[k][col]=0;
                    }
                }
            }
        }
        matrix=ans;
    }
};