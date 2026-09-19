class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] count = new int[128];

        // Count characters required from t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;

        int required = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // If this character is still needed
            if (count[ch] > 0) {
                required--;
            }

            count[ch]--;
            right++;

            // Window contains all characters of t
            while (required == 0) {

                // Update minimum window
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);

                count[leftChar]++;

                // Removing this character makes window invalid
                if (count[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}