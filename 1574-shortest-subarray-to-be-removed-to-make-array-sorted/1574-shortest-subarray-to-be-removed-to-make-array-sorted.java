class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
       int left=0;
       while(left < n-1 && arr[left]<=arr[left+1]){
        left++;
       } 
       if(left==n-1)return 0;
       int right=n-1;
       while(right>0 &&arr[right-1]<=arr[right]){
        right--;
       }
       int i=0;
       int j=right;
       int ans=Math.min(n-left-1,right);
       while(i<=left && j<n){
        if(arr[i] <=arr[j]){
            ans=Math.min(j-i-1,ans);
            i++;
        }else{
            j++;
        }
       }
       return ans;
    }
}