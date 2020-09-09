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
    int sum;
    int l, r =0; 
    public int rangeSumBST(TreeNode root, int L, int R) {
        l= L;
        r= R;
        inorder(root);
        return sum;
    }
    public void inorder(TreeNode root){
        if (root == null) 
            return;  
       
        
        if(root.val >= l && root.val <= r)
            sum += root.val;
  
       if(root.val > l) inorder(root.left);
       if(root.val < r) inorder(root.right);

    }
}