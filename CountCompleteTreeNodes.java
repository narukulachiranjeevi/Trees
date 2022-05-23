class Solution {
    int count=1;
    void rec(TreeNode root){
        if(root.left!=null){
            count++;
            rec(root.left);
        }
        if(root.right!=null){
            count++;
            rec(root.right);
        }
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        rec(root);
        return count;
    }
}
