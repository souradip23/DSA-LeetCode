class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int x = 0, r = 0;

for (char c : moves.toCharArray()) {
    x += (c == 'R' ? 1 : 0) - (c == 'L' ? 1 : 0);
    if (c == '_') {
        r++;
    }
}

return Math.abs(x) + r;
    }
}