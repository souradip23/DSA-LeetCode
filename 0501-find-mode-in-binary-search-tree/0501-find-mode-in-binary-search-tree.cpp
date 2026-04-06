/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    unordered_map<int, int> freq;

    void traverse(TreeNode* root) {
        if (!root) return;

        freq[root->val]++;
        traverse(root->left);
        traverse(root->right);
    }

    vector<int> findMode(TreeNode* root) {
        traverse(root);

        int maxFreq = 0;
        for (auto &p : freq) {
            maxFreq = max(maxFreq, p.second);
        }

        vector<int> result;
        for (auto &p : freq) {
            if (p.second == maxFreq) {
                result.push_back(p.first);
            }
        }

        return result;
    }
};