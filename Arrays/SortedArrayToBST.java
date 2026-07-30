class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {

        // Base Case
        if (left > right) {
            return null;
        }

        // Find Middle Index
        int mid = (left + right) / 2;

        // Create Root Node
        TreeNode root = new TreeNode(nums[mid]);

        // Build Left Subtree
        root.left = build(nums, left, mid - 1);

        // Build Right Subtree
        root.right = build(nums, mid + 1, right);

        return root;
    }

    // Preorder Traversal
    public void preorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);

        preorder(root.right);
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    // Postorder Traversal
    public void postorder(TreeNode root) {

        if (root == null) {
            return;
        }

        postorder(root.left);

        postorder(root.right);

        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        int nums[] = {-10, -3, 0, 5, 9};

        SortedArrayToBST obj = new SortedArrayToBST();

        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.println("Preorder Traversal:");
        obj.preorder(root);

        System.out.println();

        System.out.println("Inorder Traversal:");
        obj.inorder(root);

        System.out.println();

        System.out.println("Postorder Traversal:");
        obj.postorder(root);
    }
}