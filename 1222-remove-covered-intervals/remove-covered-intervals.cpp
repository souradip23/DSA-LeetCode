class Solution {
public:
    static bool cmp(pair<int, int>& a, pair<int, int>& b) {
        if(a.first == b.first)
            return a.second > b.second;
        return a.first < b.first;
    }
    int removeCoveredIntervals(vector<vector<int>>& intervals) {
        vector<pair<int, int>> v;
        for (vector<int>& interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            pair<int, int> p = make_pair(start, end);
            v.push_back(p);
        }
        sort(v.begin(), v.end(), cmp);
        int inend = v[0].second;

        int count = 0;

        for (int i = 1; i < v.size(); i++) {
            if (inend >= v[i].second) {
                count++;
            } else {
                inend = v[i].second;
            }
        }
        return v.size() - count;
    }
};