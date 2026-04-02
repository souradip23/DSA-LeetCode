class Solution {
public:
    vector<int> maxSubsequence(vector<int>& nums, int k) {
        int n = nums.size();
        
        // Step 1: store indices
        vector<int> idx(n);
        for(int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Step 2: sort indices based on values
        sort(idx.begin(), idx.end(), [&](int a, int b){
            return nums[a] < nums[b];
        });

        // Step 3: take last k indices (largest elements)
        vector<int> selected(idx.end() - k, idx.end());

        // Step 4: sort selected indices to maintain order
        sort(selected.begin(), selected.end());

        // Step 5: build answer
        vector<int> ans;
        for(int i : selected) {
            ans.push_back(nums[i]);
        }

        return ans;
    }
};