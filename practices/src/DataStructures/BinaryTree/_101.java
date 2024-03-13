package DataStructures.BinaryTree;

//https://leetcode.com/problems/symmetric-tree/description/
public class _101 {
    public static boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    private static boolean compare(TreeNode<Integer> left, TreeNode<Integer> right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return compare(left.right, right.left) && compare(left.left, right.right);
    }

    public static void main(String[] args) {
        TreeNode<Integer> tree = new TreeNode<>(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        System.out.println(isSymmetric(tree));
    }
}
