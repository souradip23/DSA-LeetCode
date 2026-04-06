class Solution {
    public int hammingDistance(int x, int y) {
        //In-built function -->

        //  return Integer.bitCount(x ^ y);

       // * Brian Kernighan’s Algorithm
        int xor=x^y;
        int count=0;
        while(xor!=0){
            xor=xor &(xor-1);
            count++;
        }
        return count;
    }
}