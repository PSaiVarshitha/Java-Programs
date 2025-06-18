class Solution {
    List<Integer> list=new ArrayList<>();
    void postorder(TreeNode T){
        if(T!=null){
            postorder(T.left);
            postorder(T.right);
            list.add(T.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }
}
