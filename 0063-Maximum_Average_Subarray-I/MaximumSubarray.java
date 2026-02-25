public class MaximumSubarray {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxsum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            maxsum = Math.max(maxsum, sum);
        }
        return (double) maxsum / k;
    }
}
