class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int>res;
        priority_queue<int,vector<int>,greater<int>>pq;
        for(int num: nums){
            pq.push(num);
        }
        while(!pq.empty()){
            int first=pq.top();
            pq.pop();
            int second=pq.top();
            pq.pop();
            res.push_back(second);
            res.push_back(first);
        }
        return res;
    }
};