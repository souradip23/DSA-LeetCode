class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
         int mod = 1000000007;

        // Apply all queries
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];

            for (int i = l; i <= r; i += k) {
                long val = (1L * nums[i] * v) % mod;
                nums[i] = (int) val;
            }
        }

        // Compute XOR
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}