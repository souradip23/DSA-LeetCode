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
    static int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int N=inorder.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(inorder[i],i);
        }
        postIndex=N-1;
        return build(0,N-1,inorder,postorder,map);
    }
    static TreeNode build(int start,int end,int[] inorder, int[] postorder,HashMap<Integer,Integer> map){
        if(start>end){
            return null;
        }
        int val=postorder[postIndex--];
        TreeNode root=new TreeNode(val);
        int inIndex=map.get(val);

        root.right =build(inIndex+1,end,inorder,postorder,map);
        root.left =build(start,inIndex-1,inorder,postorder,map);
        return root;
    }
}