package DataStructures.BinaryTree;

//https://leetcode.com/problems/sum-of-left-leaves/

public class _404 {

    private static int helper(TreeNode<Integer> node, boolean isLeft) {
        if(null == node) return 0;
        if(null == node.left && null == node.right)
            return node.val * (isLeft ? 1 : 0);
        return helper(node.left, true) + helper(node.right, false);
    }

    public static int sumOfLeftLeaves(TreeNode<Integer> root) {
        return helper(root, false);
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(sumOfLeftLeaves(root));
    }
}
