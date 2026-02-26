
public class FirstAndLastOccurrence {

    // Binary Search
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        if (nums.length == 0)
            return res;
        res[0] = firstPosition(nums, target);
        res[1] = lastPosition(nums, target);
        return res;
    }

    static int firstPosition(int[] nums, int target) {
        int res = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                res = mid;
                right = mid - 1;
            }
        }

        return res;
    }

    static int lastPosition(int nums[], int target) {
        int res = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                res = mid;
                left = mid + 1;
            }
        }

        return res;
    }

}
