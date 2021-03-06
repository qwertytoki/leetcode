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
        if(p !=null&&q==null)||(p ==null&&q!=null){
            return false;
        }
        if((p ==null&&q==null)||(p.val==q.val))) {
            return true;
        }
        if(p.val != q.val){
            return false;
        }
        return (isSameTree(p.right,q.right)&&isSameTree(p.left,q.left));
    }
}
