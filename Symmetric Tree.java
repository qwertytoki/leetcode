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
    public boolean isSymmetric(TreeNode root) {
        if(root ==null){
            return true;
        }
        return isSame(root.left,root.right);
    }
    private boolean isSame(TreeNode p,TreeNode q){

        if((p !=null&&q==null)||(p ==null&&q!=null)){
            return false;
        }
        if((p ==null&&q==null)) {
            return true;
        }
        if(p.val != q.val){
            return false;
        }
        return isSame(p.right,q.left)&&isSame(p.left,q.right);
    }
}