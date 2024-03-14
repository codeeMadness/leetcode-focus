package DataStructures.BinaryTree;

//https://leetcode.com/problems/path-sum/description/

public class _112 {
    public static boolean hasPathSum(TreeNode<Integer> root, int target) {
        if (root == null) return false;
        if (target == root.val && root.left == null && root.right == null) return true;

        target -= root.val;

        return hasPathSum(root.left, target) || hasPathSum(root.right, target);

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(root, 22));//true
    }
}
