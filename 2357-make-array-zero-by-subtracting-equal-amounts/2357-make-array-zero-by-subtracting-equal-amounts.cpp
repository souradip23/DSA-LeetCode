class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        int count = 0;
        int prev = 0;

        for (int num : nums) {
            if (num != 0 && num != prev) {
                count++;
                prev = num;
            }
        }

        return count;
    }
};