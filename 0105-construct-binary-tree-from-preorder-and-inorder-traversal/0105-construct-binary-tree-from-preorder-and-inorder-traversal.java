/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int N = preorder.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(inorder[i], i);
        }
        preIndex = 0;
        return build(0, N - 1, inorder, preorder, map);

    }

    static TreeNode build(int start, int end, int[] inorder, int[] preorder, HashMap<Integer, Integer> map) {
        if (start > end) {
            return null;
        }
        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);
        int inIndex = map.get(val);

        root.left = build(start, inIndex - 1, inorder, preorder, map);
        root.right = build(inIndex + 1, end, inorder, preorder, map);

        return root;
    }
}