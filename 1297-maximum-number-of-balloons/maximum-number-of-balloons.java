class Solution {
    public int maxNumberOfBalloons(String text) {
 int[] cnt = new int[26];

        for (char ch : text.toCharArray()) {
            cnt[ch - 'a']++;
        }

        int b = cnt['b' - 'a'];
        int a = cnt['a' - 'a'];
        int l = cnt['l' - 'a'] / 2;
        int o = cnt['o' - 'a'] / 2;
        int n = cnt['n' - 'a'];

        return Math.min(
                Math.min(b, a),
                Math.min(Math.min(l, o), n)
        );
    }
}