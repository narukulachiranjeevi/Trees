class Solution {
    TreeNode ans = null;
    void rec(TreeNode original,TreeNode clone,TreeNode target){
        if(target==original){
            ans=clone;
            return ;
        }
        if(original.left!=null) rec(original.left,clone.left,target);
        if(original.right!=null) rec(original.right,clone.right,target);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        rec(original,cloned,target);
        return ans;
    }
}
