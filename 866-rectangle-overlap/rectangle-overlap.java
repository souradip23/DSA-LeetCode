class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Overlap width
        int width = Math.min(rec1[2], rec2[2])
                - Math.max(rec1[0], rec2[0]);

        // Overlap height
        int height = Math.min(rec1[3], rec2[3])
                - Math.max(rec1[1], rec2[1]);

        // Positive width AND positive height = overlap
        return width > 0 && height > 0;

    }
}