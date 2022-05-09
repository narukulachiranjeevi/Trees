class Solution {
    int sum=0;
    void rec(TreeNode root){
        if(root.right!=null) rec(root.right);
        root.val+=sum;
        sum=root.val;
        if(root.left!=null) rec(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        rec(root);
        return root;
    }
}
