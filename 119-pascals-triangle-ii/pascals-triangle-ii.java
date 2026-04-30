class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row <= rowIndex; row++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int col = 1; col < row; col++) {
                int val = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                currRow.add(val);

            }
            if (row > 0) {
                currRow.add(1);
            }
            triangle.add(currRow);
        }
        return triangle.get(rowIndex);
    }
}