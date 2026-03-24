class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     int[][] res=new int[m][n];
     int[] arr=new int[m*n];
     int idx=0;
     int mod=12345;
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[idx++]=grid[i][j]%12345;
        }
     }
     int left=1;
     int right=1;
     int [] newarr=new int[m*n];
     Arrays.fill(newarr,1);
     for(int i=0;i<newarr.length;i++){
     // prefix
            newarr[i] = (newarr[i] * left) % mod;
            left = (left * arr[i]) % mod;

            // suffix
            newarr[arr.length - i - 1] = (newarr[arr.length - i - 1] * right) % mod;
            right = (right * arr[arr.length - i - 1]) % mod;
     }
      idx=0;
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            res[i][j]=newarr[idx++] % mod;
        }
     }
     return res;
    }
}