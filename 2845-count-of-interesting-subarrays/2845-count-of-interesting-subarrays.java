class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        long count = 0;
        int prefix = 0;
        for (int num : nums) {
            if (num % modulo == k) {
                prefix++;
            }
            int rem = prefix % modulo;

            int target = (rem - k + modulo) % modulo;

            if (map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(rem,map.getOrDefault(rem,0L)+1);
        }
        return count;
    }
}