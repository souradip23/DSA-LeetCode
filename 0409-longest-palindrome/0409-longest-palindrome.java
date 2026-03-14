class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int oddcount = 0;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1) {
                oddcount++;
            } else {
                oddcount--;
            }

        }
        if (oddcount > 1) {
            return s.length() - oddcount + 1;
        }
        return s.length();
    }
}