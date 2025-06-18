class Solution {
    List<Integer> list = new ArrayList<>();
    void preorder(TreeNode T){
        if(T!=null){
            list.add(T.val);
            preorder(T.left);
            preorder(T.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
}
