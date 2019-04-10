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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        currentP = p;
        currentQ = q;
        if (isDifferent(currentP,currentQ)){
            return false;
        }
        currentP = p.right;
        currentQ = q.right;
        if (isSameTree(currentP,currentQ)){
            return false;
        }
        currentP = p.left;Q
        currentQ = q.left;
        if (isSameTree(currentP,currentQ)){
            return false;
        }
        return true;
        
    }
    private boolean isDifferent(p,q){
        if(p != q){
            return true;
        }
        if((p.right == null && q.right != null)||(p.right != null && q.right == null)(p.right != q.right)){
            return true;
        }
        if((p.left == null && q.left != null)||(p.left != null && q.left == null)(p.left != q.left)){
            return true;
        }
        return false;
        
    }
}
