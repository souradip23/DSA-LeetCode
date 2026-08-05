class Solution {
    public boolean hasAlternatingBits(int n) {
       int mask = n ^ (n >> 1);
       return (mask & (mask+1)) ==0;
    }
}