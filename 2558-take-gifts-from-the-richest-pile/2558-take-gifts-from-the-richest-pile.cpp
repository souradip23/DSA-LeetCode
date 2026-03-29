class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
        priority_queue<int> pq;
        for (int num : gifts) {
            pq.push(num);
        }
        while (k--) {
            int top = pq.top();
            pq.pop();
            int remaining = sqrt(top);
            pq.push(remaining);
            if (pq.top() == 1) {
                break;
            }
        }
        long long sum = 0;
        while (!pq.empty()) {
            sum += pq.top();
            pq.pop();
        }
        return sum;
    }
};