class Solution {
    void rec(TreeNode root,List<Integer> list){
        if(root.left!=null) rec(root.left,list);
        list.add(root.val);
        if(root.right!=null) rec(root.right,list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return Arrays.asList();
        else if(root1==null && root2!=null){
            List<Integer> list = new ArrayList<>();
            rec(root2,list);
            return list;
        }
        else if(root1!=null && root2==null){
            List<Integer> list = new ArrayList<>();
            rec(root1,list);
            return list;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        rec(root1,list);
        rec(root2,list2);
        int i=0,j=0;
        while(i<list.size() && j<list2.size()){
            if(list.get(i)>list2.get(j)){
                list.add(i,list2.get(j));
                j++;
            }
            i++;
        }
        while(j<list2.size()){
            list.add(i,list2.get(j));
            j++;
            i++;
        }
        return list;
    }
}
