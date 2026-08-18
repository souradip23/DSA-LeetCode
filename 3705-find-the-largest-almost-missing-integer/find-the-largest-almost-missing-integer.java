class Solution {
    public int largestInteger(int[] A, int k) {
        //get as per size
        int[] f = new int[51];
        // get the frequency 
        for (int x : A)
            f[x]++;

        int res = -1, n = A.length;

        for (int i = 0; i < n; i++)
            if (k == n || (f[A[i]] == 1 && (k == 1 || i == 0 || i == n - 1)))
                res = Math.max(res, A[i]);

        return res;
    }
}