class Solution {
    static void generate(List<String> res, int n, int open, int closed, String str) {
        if (str.length() == 2 * n) {
            res.add(str);
            return;
        }
        if (open < n) {
            generate(res, n, open + 1, closed, str + "(");
        }
        if (closed < open) {
            generate(res, n, open, closed + 1, str + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, n, 0, 0, "");
        return res;
    }
}