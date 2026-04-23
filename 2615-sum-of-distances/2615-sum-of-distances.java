import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, Long> count = new HashMap<>();
        Map<Integer, Long> sum = new HashMap<>();

        // 👉 Left to right
        for (int i = 0; i < n; i++) {
            int val = nums[i];

            long c = count.getOrDefault(val, 0L);
            long s = sum.getOrDefault(val, 0L);

            res[i] += i * c - s;

            count.put(val, c + 1);
            sum.put(val, s + i);
        }

        // reset maps
        count.clear();
        sum.clear();

        // 👉 Right to left
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];

            long c = count.getOrDefault(val, 0L);
            long s = sum.getOrDefault(val, 0L);

            res[i] += s - i * c;

            count.put(val, c + 1);
            sum.put(val, s + i);
        }

        return res;
    }
}