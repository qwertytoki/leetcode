/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return dive(root, 1);
    }

    private int dive(TreeNode root, int depth) {
        if ((root == null) || (root.right == null && root.left == null)) {
            return depth;
        }
        depth++;
        return Math.max(dive(root.right, depth), dive(root.left, depth));
    }
}