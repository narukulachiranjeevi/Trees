class FindElements {
    Map<Integer,Integer> map = new HashMap<>();
    void rec(TreeNode root){
        map.put(0,1);
        Queue<TreeNode> queue = new ArrayDeque<>();
        root.val=0;
        queue.add(root);
        int parent = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){ 
                temp.left.val=(2*temp.val)+1;
                map.put((2*temp.val)+1,0);
                queue.add(temp.left);
            }
            if(temp.right!=null) {
                temp.right.val=(2*temp.val)+2;
                map.put((2*temp.val)+2,1);
                queue.add(temp.right);
            }
        }
    }
    public FindElements(TreeNode root) {
        rec(root);
    }
    
    public boolean find(int target) {
        return map.containsKey(target);
    }
}
