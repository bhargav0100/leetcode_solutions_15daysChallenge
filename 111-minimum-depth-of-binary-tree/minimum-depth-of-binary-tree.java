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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int depth=1;
        Queue<TreeNode>q=new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            int children=q.size();
            for(int i=1;i<=children;i++)
            {
                TreeNode child=q.poll();
                if(child.left==null && child.right==null)
                {
                    return depth;
                }
                if(child.left!=null)
                {
                    q.add(child.left);
                }
                if(child.right!=null)
                {
                    q.add(child.right);
                }
            }
            depth++;
        }
        return depth;
    }
}