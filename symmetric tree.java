class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return ismirror(root.left,root.right);
    }
    public boolean ismirror(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val!=root2.val){
               return false;
        }
        return ismirror(root1.left,root2.right)&&ismirror(root1.right,root2.left);
    }
}