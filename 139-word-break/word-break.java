class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        
        // dp[i] represents if we can reach index i
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // We start at index 0
        
        for (int i = 0; i < n; i++) {
            // If we can't reach this tile, we can't jump from it
            if (!dp[i]) continue;
            
            // Try jumping forward with every word in our dictionary
            for (String word : wordDict) {
                int size = word.length();
                
                // If the word fits within the remaining string...
                if (i + size <= n && s.substring(i, i + size).equals(word)) {
                    // ...we can successfully reach the new index!
                    dp[i + size] = true;
                }
            }
        }
        
        // Did we manage to reach the very end of the string?
        return dp[n];
    }
}