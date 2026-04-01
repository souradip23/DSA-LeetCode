class Solution {
public:
    int maximumRobots(vector<int>& chargeTimes, vector<int>& runningCosts,long long budget) {
        deque<int> dq; // stores indices of chargeTimes (max at front)
        long long sum = 0;
        int left = 0, ans = 0;
        for (int right = 0; right < chargeTimes.size(); right++) {
            // Maintain decreasing deque (max at front)
            while (!dq.empty() &&
                   chargeTimes[dq.back()] <= chargeTimes[right]) {
                dq.pop_back();
            }
            dq.push_back(right);
            // Add running cost
            sum += runningCosts[right];
            // Shrink window if cost exceeds budget
            while (!dq.empty() &&
                   chargeTimes[dq.front()] + (right - left + 1) * sum >
                       budget) {
                // Remove from deque if needed
                if (dq.front() == left) {
                    dq.pop_front();
                }
                sum -= runningCosts[left];
                left++;
            }
            // Update answer
            ans = max(ans, right - left + 1);
        }
        return ans;
    }
};