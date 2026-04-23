import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        // 👉 Step 1: create new array with extra space
        int[][] arr = new int[n + 1][2];

        for (int i = 0; i < n; i++) {
            arr[i] = intervals[i];
        }
        arr[n] = newInterval;

        // 👉 Step 2: sort
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // 👉 Step 3: merge
        int[][] res = new int[n + 1][2];
        int e = 0;
        res[0] = arr[0];

        for (int i = 1; i < n + 1; i++) {
            if (arr[i][0] <= res[e][1]) {
                res[e][1] = Math.max(res[e][1], arr[i][1]);
            } else {
                e++;
                res[e] = arr[i];
            }
        }

        return Arrays.copyOfRange(res, 0, e + 1);
    }
}
