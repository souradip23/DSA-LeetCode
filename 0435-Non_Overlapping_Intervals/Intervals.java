
public class Intervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1]; // sort by end time
            }
        });

        int end = Integer.MIN_VALUE;
        int remove = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (end <= intervals[i][0]) {
                end = intervals[i][1];
            } else {
                remove++;
            }
        }

        return remove;
    }
}
