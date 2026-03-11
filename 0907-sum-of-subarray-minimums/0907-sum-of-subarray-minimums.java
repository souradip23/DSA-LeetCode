class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n=arr.length;
       int [] nse=new int[n];
       int [] pse=new int[n];
       Stack<Integer> st=new Stack<>();

       // for nse 
       for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()] > arr[i]){
            st.pop();
        }
        nse[i]=st.isEmpty() ? n : st.peek();
        st.push(i);
       } 
       //clear the stack 
       st.clear();

       // for pse
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty() ? -1: st.peek();
            st.push(i);
        }

        long sum=0;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum+=(arr[i] * left*right)%mod;
            sum%=mod;

        }
        return (int)sum;
    }
}