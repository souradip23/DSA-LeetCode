class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
       priority_queue<
            pair<int, pair<int,int>>, 
            vector<pair<int, pair<int,int>>>, 
            greater<pair<int, pair<int,int>>>
        > pq;

        vector<vector<int>>v;
        for(auto point : points){
            int x=point[0];
            int y=point[1];
            int distance=x*x+y*y;
            // int root=sqrt(distance);
            pq.push({distance,{x,y}});   
        }
        while(k--){
            auto top=pq.top();
            pq.pop();
            v.push_back({top.second.first,top.second.second});
        }
        return v;
    }
};