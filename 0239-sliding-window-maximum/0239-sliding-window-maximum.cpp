class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {

        // Using Deque
        deque<int> dq; // stores indices
        vector<int> result;

        for (int i = 0; i < nums.size(); i++) {

            // Remove indices out of window
            if (!dq.empty() && dq.front() == i - k) {
                dq.pop_front();
            }

            // Remove smaller elements from back
            while (!dq.empty() && nums[dq.back()] < nums[i]) {
                dq.pop_back();
            }

            // Push current index
            dq.push_back(i);

            // Add to result when first window is complete
            if (i >= k - 1) {
                result.push_back(nums[dq.front()]);
            }
        }

        return result;

        // Using priority queue ----------------------------------->

        // priority_queue<pair<int, int>> pq;
        // vector<int> res;
        // for (int i = 0; i < k; i++) {
        //     pq.push(make_pair(nums[i], i));
        // }
        // res.push_back(pq.top().first);

        // for (int i = k; i < nums.size(); i++) {
        //     while (!pq.empty() && pq.top().second <= i - k) {
        //         pq.pop();
        //     }
        //     pq.push(make_pair(nums[i], i));
        //     res.push_back(pq.top().first);
        // }
        // return res;
    }
};