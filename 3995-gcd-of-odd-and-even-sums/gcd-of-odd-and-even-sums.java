class Solution {
    public int gcd(int i,int j){
        if(j==0)return i;
        return gcd(j,i%j);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumeven=n*n;
        int sumodd=n*(n+1);
        return gcd(sumeven,sumodd);
    }
    
}