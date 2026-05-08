class Solution {
    public int minJumps(int[] nums) {
                int n = nums.length;

        if (n == 1) {
            return 0;
        }

        int maxVal = 0;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
        }

        // Smallest Prime Factor (SPF) sieve
        int[] spf = new int[maxVal + 1];

        for (int i = 0; i <= maxVal; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= maxVal; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= maxVal; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        // prime factor -> list of indices divisible by it
        Map<Integer, List<Integer>> factorToIndices = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            Set<Integer> factors = new HashSet<>();

            while (x > 1) {
                int p = spf[x];
                factors.add(p);

                while (x % p == 0) {
                    x /= p;
                }
            }

            for (int p : factors) {
                factorToIndices
                    .computeIfAbsent(p, k -> new ArrayList<>())
                    .add(i);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(0);
        visited[0] = true;

        Set<Integer> usedPrime = new HashSet<>();

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int s = 0; s < size; s++) {
                int i = queue.poll();

                if (i == n - 1) {
                    return steps;
                }

                // Move left
                if (i - 1 >= 0 && !visited[i - 1]) {
                    visited[i - 1] = true;
                    queue.offer(i - 1);
                }

                // Move right
                if (i + 1 < n && !visited[i + 1]) {
                    visited[i + 1] = true;
                    queue.offer(i + 1);
                }

                int val = nums[i];

                // Prime teleportation
                if (val >= 2 && spf[val] == val && !usedPrime.contains(val)) {

                    List<Integer> nextIndices =
                        factorToIndices.getOrDefault(val, new ArrayList<>());

                    for (int ni : nextIndices) {
                        if (!visited[ni]) {
                            visited[ni] = true;
                            queue.offer(ni);
                        }
                    }

                    usedPrime.add(val);
                }
            }

            steps++;
        }

        return -1;
    }
}