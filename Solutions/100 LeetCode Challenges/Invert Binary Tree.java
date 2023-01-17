// Problem Link: https://leetcode.com/problems/invert-binary-tree/description/
// Submission Link: https://leetcode.com/problems/invert-binary-tree/submissions/878756454/
// Submission Link: https://leetcode.com/problems/invert-binary-tree/submissions/880064885/

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
    public TreeNode invertTree(TreeNode root) {
       if (root == null) return null;

       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;

       invertTree(root.left);
       invertTree(root.right);
       return root;
    }
}

// Help of Function -- Method 2

class Solution {
	public TreeNode invertTree(TreeNode root) {
       invert(root);
	   return root;
	}
	public void invert(TreeNode node){
		
	   if (node == null) return;

       TreeNode temp = node.left;
       node.left = node.right;
       node.right = temp;

       invert(node.left);
       invert(node.right);
    }
}