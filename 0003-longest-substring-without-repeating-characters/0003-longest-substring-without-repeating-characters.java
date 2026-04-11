class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (seen.contains(ch)) {
                    break;
                }
                seen.add(ch);
                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}