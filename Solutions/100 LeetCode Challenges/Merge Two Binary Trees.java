// Problem Link: https://leetcode.com/problems/merge-two-binary-trees/description/
// Submission Link: https://leetcode.com/problems/merge-two-binary-trees/submissions/880087472/

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
 
//Using Recursion

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        TreeNode output = new TreeNode(root1.val+root2.val);
        output.left = mergeTrees(root1.left,root2.left);
        output.right = mergeTrees(root1.right,root2.right);
        return output;
    }
}