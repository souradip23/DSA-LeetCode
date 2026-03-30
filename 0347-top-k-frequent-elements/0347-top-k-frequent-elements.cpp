class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int>res;
        priority_queue<pair<int,int>>pq;
        unordered_map<int,int>mp;
        for(int num:nums){
            mp[num]++;
        }
        for(auto m:mp){
         pq.push({m.second,m.first});
        }
       while(k-- && !pq.empty()){
        res.push_back(pq.top().second);
        pq.pop();
       }
    return res;
    }
};