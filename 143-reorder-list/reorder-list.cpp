
class Solution {
public:
    void reorderList(ListNode* head) {
        if (!head)
            return;
        vector<int> v;
        ListNode* temp = head;
        while (temp != nullptr) {
            v.push_back(temp->val);
            temp = temp->next;
        }
        if (v.size() == 0)
            return;
        int left = 0;
        int right = v.size() - 1;

        vector<int> ans;
        while (left < right) {
            ans.push_back(v[left]);
            ans.push_back(v[right]);
            left++;
            right--;
        }
        if (left == right) {
            ans.push_back(v[left]);
        }
        // for (int i = 0; i < ans.size(); i++) {
        //     cout << ans[i] << " ";
        // }

        temp = head;

        int i = 0;

        while (temp != nullptr) {
            temp->val = ans[i++];
            temp = temp->next;
        }
    }
};