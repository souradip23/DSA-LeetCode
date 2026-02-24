
public class Histogram {
    // Brute Force

    public int largestRectangleArea1(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int left = i;
            int right = i;

            while (left >= 0 && heights[left] >= height) {
                left--;
            }

            while (right < n && heights[right] >= height) {
                right++;
            }

            int width = right - left - 1;
            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Optimal Solution -- Using Stack

    public int largestRectangleArea2(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int height = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int h = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, h * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
