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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> res = new ArrayList<>();
       helper(root,res);
       return res; 
    }
     private void helper(TreeNode node , List<Integer>list){
        if(node==null){
            return;
        }
        helper(node.left,list);
        
        helper(node.right,list);
        
        list.add(node.val);
    }
}
