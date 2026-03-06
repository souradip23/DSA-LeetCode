class Solution {
    public int[][] generateMatrix(int n) {
       int r=n;
       int c=n;
       int[][] res=new int[r][c];
       int count=0;
       int total=r*c;
       int startingRow=0;
       int startingCol=0;
       int endingRow=r-1;
       int endingCol=c-1;
       int newcount=1;
       while(count<total){
        for(int i=startingCol;count<total && i<=endingCol;i++){
            res[startingRow][i]= newcount;
           newcount++;
           count++;
        }
        startingRow++;
        for(int i=startingRow;count<total && i<=endingRow;i++){
            res[i][endingCol]=newcount;
            newcount++;
            count++;
        }
        endingCol--;
        for(int i=endingCol;count<total && i>=startingCol;i--){
            res[endingRow][i]=newcount;
            newcount++;
            count++;
        }
        endingRow--;
        for(int i=endingRow;count<total && i>=startingRow;i--){
            res[i][startingCol]=newcount;
            newcount++;
            count++;
        }
        startingCol++;

       }
       return res;
    }
}