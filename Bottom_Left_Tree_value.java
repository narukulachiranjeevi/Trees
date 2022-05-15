class Solution {
    int max=0,ans=0;
    void rec(TreeNode root,int level){
        if(root.left!=null) rec(root.left,level+1);
        else if(root.right==null){
            if(max<level){
                max=level;
                ans=root.val;
            }
        }
        if(root.right!=null) rec(root.right,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        rec(root,0);
        return ans;
    }
}
