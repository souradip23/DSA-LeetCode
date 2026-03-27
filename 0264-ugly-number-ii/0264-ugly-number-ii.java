class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int count = 0;
        int num = 1;

        while (count < n) {
            if (isUgly(num)) {
                arr[count] = num;
                count++;
            }
            num++;
        }

        return arr[n - 1];
    }

    public boolean isUgly(int num) {
        int[] factors = { 2, 3, 5 };
        for (int f : factors) {
            while (num % f == 0) {
                num /= f;
            }
        }

        return num == 1;
    }
}