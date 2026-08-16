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
class Solution 
{
    int max = -1;
    int ans = -1;
    public int findBottomLeftValue(TreeNode root) 
    {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode node, int d)
    {
        if(node==null)
        {
            return;
        }
        //root preorder
        if(d>max)
        {
            max=d;
            ans = node.val;
        }
        dfs(node.left, d+1);
        dfs(node.right, d+1);
    }
}