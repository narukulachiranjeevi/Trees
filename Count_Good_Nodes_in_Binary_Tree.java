/*in between root node to leave node finding max element 
if current node val greater than  max element then its must be greater than the all element from root node  to current node */
class Solution {
    int count=0;
    void rec(int max,TreeNode root){
        if(root.val>=max) count++; //comparing with present node with max
        if(root.left!=null){
            max=Math.max(root.val,max); // finding max element from root to current node
            rec(max,root.left);
        }
        if(root.right!=null){
            max=Math.max(root.val,max); // finding max element from root to current node
            rec(max,root.right);
        }
    }
    public int goodNodes(TreeNode root) {
        rec(root.val,root);
        return count;
    }
}
