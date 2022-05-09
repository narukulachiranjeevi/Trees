class Solution {
    void rec(TreeNode root,TreeNode parent,int target){
        if(root.left!=null) rec(root.left,root,target);
        if(root.right!=null) rec(root.right,root,target);
        if(root.val==target && root.left==null && root.right==null){
            if(parent.left==root) parent.left=null;
            else if(parent.right==root) parent.right=null;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        rec(root,root,target);
        if(root.left==null && root.right==null && root.val==target) return null;
        return root;
    }
}
