class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int sum = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int i=0;
            sum=0;
            while(i++<size){
                TreeNode cur = queue.poll();
                if(cur.right!=null) queue.add(cur.right);
                if(cur.left!=null) queue.add(cur.left);
                sum+=cur.val;
            }
        }
        return sum;
    }
}
