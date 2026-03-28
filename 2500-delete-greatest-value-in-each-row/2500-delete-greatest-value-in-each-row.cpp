class Solution {
public:
    int deleteGreatestValue(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        for (auto& row : grid) {
            sort(row.begin(), row.end());
        }
        int ans = 0;
        for (int col = n - 1; col >= 0; col--) {
            int maxi = 0;
            for (int row = 0; row < m; row++) {
                maxi = max(maxi, grid[row][col]);
            }
            ans += maxi;
        }
        return ans;
    }
};