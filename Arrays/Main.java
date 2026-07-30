 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
 }
 public class Main{
    public static void main (String[] args){
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(5);
        root.right=new TreeNode(14);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
 }