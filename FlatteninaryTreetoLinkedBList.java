class Solution {
    TreeNode pr = null;
    void rec(TreeNode root){
        if(root.right!=null) rec(root.right);
        if(root.left!=null) rec(root.left);
        root.right=pr;
        pr=root;
        root.left=null;
    }
    public void flatten(TreeNode root) {
        if(root==null) return ;
        rec(root);
    }
}
