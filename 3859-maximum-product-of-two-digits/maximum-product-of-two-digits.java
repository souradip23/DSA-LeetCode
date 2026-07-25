class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
             arr[i]=s.charAt(i)-'0';
        }
        int max=0;
        int smax=0;
        for(int i=0;i<arr.length;i++){
            if(max <arr[i]){
                smax=max;
                max=arr[i];
            }else if(smax < arr[i] ){
                smax=arr[i];
            }
        }
        return max*smax;
    }
}