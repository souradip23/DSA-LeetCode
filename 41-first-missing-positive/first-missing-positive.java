class Solution {
    public int firstMissingPositive(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int xor = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int index = 0;
        for (int i = 1; i <= maxi; i++) {
            if (!set.contains(i)) {
                return i;
            }
            index = i;

        }
        return index + 1;
    }
}