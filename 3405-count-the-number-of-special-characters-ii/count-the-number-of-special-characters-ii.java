import java.util.Arrays;

class Solution {
    public int numberOfSpecialChars(String word) {
        // Arrays to store the first seen index of uppercase and last seen of lowercase
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        
        // Fill arrays with -1 to indicate "not seen yet"
        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, -1);
        
        // Array to flag letters that broke the rule (lowercase after uppercase)
        boolean[] isInvalid = new boolean[26];
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                int idx = ch - 'a';
                lastLower[idx] = i;
                
                // If we already saw the uppercase version, this lowercase is too late!
                if (firstUpper[idx] != -1) {
                    isInvalid[idx] = true;
                }
            } else {
                int idx = ch - 'A';
                // Only record the FIRST occurrence of the uppercase letter
                if (firstUpper[idx] == -1) {
                    firstUpper[idx] = i;
                }
            }
        }
        
        int specialCount = 0;
        
        // Verify all 26 letters
        for (int i = 0; i < 26; i++) {
            // Must have seen both, must be valid, and last lower must be before first upper
            if (lastLower[i] != -1 && firstUpper[i] != -1 && !isInvalid[i] && lastLower[i] < firstUpper[i]) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}
