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
    List<Integer> soln = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null){
            return soln;
        }
        inorderTraversal(root.left);
        soln.add(root.val);
        inorderTraversal(root.right);
        return soln;
    }
}