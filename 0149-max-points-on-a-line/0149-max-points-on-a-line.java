class Solution {
   public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int result = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int duplicates = 1;
            int max = 0;

            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                if (x1 == x2 && y1 == y2) {
                    duplicates++;
                } else {
                    int dx = x2 - x1;
                    int dy = y2 - y1;

                    int gcd = gcd(dx, dy);
                    dx /= gcd;
                    dy /= gcd;

                    String slope = dy + "/" + dx;

                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    max = Math.max(max, map.get(slope));
                }
            }

            result = Math.max(result, max + duplicates);
        }

        return result;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}