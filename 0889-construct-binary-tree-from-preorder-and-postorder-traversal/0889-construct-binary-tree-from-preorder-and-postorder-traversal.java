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

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode build(int[] pre, int[] post, int preL, int preR, int postL, int postR) {

        if (preL > preR) return null;

        TreeNode root = new TreeNode(pre[preL]);

        if (preL == preR) return root;

        int leftRoot = pre[preL + 1];

        int index = postL;
        while (post[index] != leftRoot) {
            index++;
        }

        int leftSize = index - postL + 1;

        root.left = build(pre, post, preL + 1, preL + leftSize, postL, index);

        root.right = build(pre, post, preL + leftSize + 1, preR, index + 1, postR - 1);

        return root;
    }
}