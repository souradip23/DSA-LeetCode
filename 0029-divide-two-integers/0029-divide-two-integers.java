class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
        if(divisor==0){
            throw new ArithmeticException("Can't divide by 0");
        }     
      return dividend/divisor;  
    }
}