class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[n * m];
        int idx = 0;
        for (int i = 0; i < m + n - 1; i++) {
            int row = (i < m) ? 0 : i - m + 1;
            int col = (i < m) ? i : m - 1;
            ArrayList<Integer> temp = new ArrayList<>();

            while (row < n && col >= 0) {
                temp.add(mat[row][col]);
                row++;
                col--;
            }

            if (i % 2 == 0) {
                Collections.reverse(temp);
            }

            for (int val : temp) {
                res[idx++] = val;
            }
        }
        return res;
    }
}