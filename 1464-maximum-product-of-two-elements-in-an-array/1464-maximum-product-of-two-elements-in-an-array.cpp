class Solution {
public:
    int maxProduct(vector<int>& nums) {
        priority_queue<int> pq;
        for (int i = 0; i < nums.size(); i++) {
            pq.push(nums[i]);
        }
        int maxProduct = INT_MIN;
        while (!pq.empty()) {
            int first = pq.top();
            pq.pop();
            int second = pq.top();
            int product = ((first - 1) * (second - 1));
            maxProduct = max(product, maxProduct);
        }
        return maxProduct;
    }
};