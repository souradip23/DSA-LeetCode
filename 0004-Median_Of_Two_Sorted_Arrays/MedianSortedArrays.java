
public class MedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m + n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            merge[idx++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merge[idx++] = nums2[i];
        }
        Arrays.sort(merge);
        int total = merge.length;
        if (total % 2 == 1) {
            return (double) merge[total / 2];
        } else {
            return ((double) merge[total / 2] + (double) merge[total / 2 - 1]) / 2.0;
        }
    }

}
