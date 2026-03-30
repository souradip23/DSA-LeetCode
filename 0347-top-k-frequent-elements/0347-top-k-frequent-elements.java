class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max Heap (based on frequency)
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        // Step 3: Get top k elements
        int[] res = new int[k];
        int i = 0;

        while (k-- > 0 && !pq.isEmpty()) {
            res[i++] = pq.poll().getKey(); // get number
        }

        return res;
    }
}