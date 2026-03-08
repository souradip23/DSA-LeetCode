class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        int [][] res=new int[m][n];
        for(int i=0;i<m;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;

    }
}