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
 * }.l
 */
class Solution {

    TreeNode xparent=null;
    TreeNode yparent=null;
    int xlevel=-1;
    int ylevel=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,0,x,y);
        return xparent!=yparent&&xlevel==ylevel;
    }

    public void dfs(TreeNode root,TreeNode parent,int level, int x, int y){
    if(root == null){
        return ;
    }
    if(root.val==x){
     xlevel=level;
     xparent=parent;
    }
    if(root.val==y){
        ylevel=level;
        yparent=parent;
    }
    dfs(root.left,root,level+1,x,y);
    
dfs(root.right,root,level+1,x,y);
}
}