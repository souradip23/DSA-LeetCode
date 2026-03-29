class Solution {
    public int fillCups(int[] amount) {
        int cold=amount[0];
        int warm=amount[1];
        int hot=amount[2];
        int total=cold+warm+hot;
        int maxVal=Math.max(cold,Math.max(warm,hot));
        return Math.max(maxVal,(total+1)/2);
    }
}