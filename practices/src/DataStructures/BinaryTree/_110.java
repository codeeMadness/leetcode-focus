package DataStructures.BinaryTree;

//https://leetcode.com/problems/balanced-binary-tree/description/

public class _110 {

    public static boolean isBalanced(TreeNode root) {
        if (root == null)  return true;
        return Height(root) != -1;
    }

    public static int Height(TreeNode root) {
        if (root == null)  return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        if (leftHeight == -1 || rightHeight == -1)  return -1;
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(isBalanced(root));
    }
}
