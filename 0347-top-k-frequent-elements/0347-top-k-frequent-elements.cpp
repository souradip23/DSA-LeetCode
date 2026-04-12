class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int>res;
        priority_queue<int>pq;
        unordered_map<int,int>mp;
        for(int num:nums){
            mp[num]++;
        }
        for(auto &a: mp){
            pq.push({a.second,a.first});
        }
        while(k-- && !pq.empty()){
            res.push_back(pq.top().second);
            pq.pop();
        }
    return res;
    }
};