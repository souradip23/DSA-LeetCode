
public class Intersection {

    // Optimsl O(n)
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums1[i]);
        }
        List<Integer> helper = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (set.contains(nums2[i])) {
                helper.add(nums2[i]);
                set.remove(nums2[i]); // important step
            }
        }

        int size = helper.size();
        int ans[] = new int[size];

        for (int i = 0; i < size; i++) {
            ans[i] = helper.get(i);
        }

        return ans;
    }

    // Brute Force o(n^2)

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    result.add(num1);
                    break;
                }
            }
        }
        int[] res = new int[result.size()];
        int i = 0;

        for (int num : result) {
            res[i++] = num;
        }

        return res;
    }
}
