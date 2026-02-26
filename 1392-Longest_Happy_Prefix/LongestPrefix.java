
public class LongestPrefix {

    // O(n^2) --Time complexity
    public String longestPrefix(String s) {
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            String suffix = s.substring(0, i);
            String prefix = s.substring(n - i);
            if (suffix.contains(prefix)) {
                return suffix;
            }
        }
        return "";
    }

    // O(n)
    public String longestPrefix2(String s) {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // lps[n-1] gives the length of longest happy prefix
        return s.substring(0, lps[n - 1]);
    }
}
