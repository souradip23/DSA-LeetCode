class Solution {
    private:
    static  bool comp(pair<int,int>&a,pair<int,int>&b){
        return a.second < b.second;
    }

public:
    int findMaximizedCapital(int k, int w, vector<int>& profits, vector<int>& capital) {
        vector<pair<int,int>>v;
        int size=profits.size();
        for(int i=0;i<size;i++){
            pair<int,int> p=make_pair(profits[i],capital[i]);
            v.push_back(p);
        }
        int profit=0;
        sort(v.begin(),v.end(),comp);
         priority_queue<int> pq;

        int i = 0;

        // take at most k projects
        while(k--){
            // add all affordable projects
            while(i < size && v[i].second <= w){
                pq.push(v[i].first); // profit
                i++;
            }

            // if no project available
            if(pq.empty()) break;

            // take max profit
            w += pq.top();
            pq.pop();
        }

        return w; // final capital
    }
};