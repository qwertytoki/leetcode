/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // 深さを探る
        // 自分の深さをもって潜ればいいのかな？
        // rootとdepthをもって、潜る
        // 最深部まできたら、その値返す
        // 返された値がmaxDepthより深ければ、maxDepthを入れ替える
        if(root == null){
            return 0;
        }
        return dive(root,0);
        
    }
    private int dive(TreeNode root,int depth){
        if(root == null){
            return depth;
        }
        depth++;
        if(root.right== null&&root.left==null){
            return depth;
        }
        int right = dive(root.right,depth);
        int left = dive(root.left,depth);
        return right>=left ? right:left;
    }
}