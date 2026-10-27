class Solution {
    public String[] createGrid(int m, int n) {
        String[] result = new String[m];
        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            if (i == m - 1) {
                Arrays.fill(row, '.');
            } else {
                Arrays.fill(row, '#');
                row[0] = '.';
            }
            result[i] = new String(row);
        }
        return result;
    }
}