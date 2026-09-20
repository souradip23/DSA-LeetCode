class Solution {
    public int reverseDegree(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int product = 1;
            char ch = s.charAt(i);
            int idxAlpha = 26-(ch - 'a');
            product = idxAlpha * (i+1);
            sum += product;
        }
        return sum;
    }
}