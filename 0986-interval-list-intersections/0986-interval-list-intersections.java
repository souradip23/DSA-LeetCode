class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
          int n = firstList.length;
        int m = secondList.length;

        int[][] res = new int[n+m][2];
        int k = 0;

        int i = 0, j = 0;

        while (i < n && j < m) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            // overlap exists
            if (start <= end) {
                res[k][0] = start;
                res[k][1] = end;
                k++;
            }

            // move pointer
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(res, k);
    }
}