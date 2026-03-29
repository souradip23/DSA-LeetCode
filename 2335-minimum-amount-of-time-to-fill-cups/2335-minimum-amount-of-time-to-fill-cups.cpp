class Solution {
public:
    int fillCups(vector<int>& amount) {
        int cold = amount[0];
        int warm = amount[1];
        int hot = amount[2];
        int total = cold + warm + hot;
        int maxVal = max({cold, warm, hot});
        return max(maxVal, (total + 1) / 2);
    }
};