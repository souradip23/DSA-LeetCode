class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string, int> mp;
        for (auto& word : words) {
            mp[word]++;
        }
        vector<string> res;
        for (auto& it : mp) {
            res.push_back(it.first);
        }
        sort(res.begin(), res.end(), [&](string& a, string& b) {
            if (mp[a] != mp[b]) {
                return mp[a] > mp[b]; 
            }
            return a < b;
        });
        res.resize(k);
        return res;
    }
};