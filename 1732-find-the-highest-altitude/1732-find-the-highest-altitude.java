class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxAlt = 0;
        for (int num : gain) {
            sum += num;
            maxAlt = Math.max(sum, maxAlt);
        }
        return maxAlt;
    }
}