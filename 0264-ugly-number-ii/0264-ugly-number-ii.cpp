class Solution {
public:
    int nthUglyNumber(int n) {
        priority_queue<long, vector<long>, greater<long>> pq;
        unordered_set<long> st;

        pq.push(1);
        st.insert(1);

        long num = 1;

        for(int i = 0; i < n; i++) {
            num = pq.top();
            pq.pop();

            long a = num * 2;
            long b = num * 3;
            long c = num * 5;

            if(st.find(a) == st.end()) {
                pq.push(a);
                st.insert(a);
            }
            if(st.find(b) == st.end()) {
                pq.push(b);
                st.insert(b);
            }
            if(st.find(c) == st.end()) {
                pq.push(c);
                st.insert(c);
            }
        }

        return num;
    }
};