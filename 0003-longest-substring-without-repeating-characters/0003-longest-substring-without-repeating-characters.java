class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxlen = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     HashSet<Character> seen = new HashSet<>();
        //     for (int j = i; j < s.length(); j++) {
        //         char ch = s.charAt(j);
        //         if (seen.contains(ch)) {
        //             break;
        //         }
        //         seen.add(ch);
        //         int len = j - i + 1;
        //         maxlen = Math.max(maxlen, len);
        //     }
        // }
        // return maxlen;
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int n=s.length();
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}