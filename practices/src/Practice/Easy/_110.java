package Practice.Easy;

import DataStructures.BinaryTree.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/description/
public class _110 {
    public static boolean isBalanced(TreeNode root) {
        if(null == root || (null == root.getLeft() && null == root.getRight())) return true;
        int hLeft = height(root.getLeft());
        int hRight = height(root.getRight());

        return Math.abs(hLeft - hRight) <= 1 && isBalanced(root.getLeft()) && isBalanced(root.getRight());
    }

    public static int height(TreeNode root) {
        if(null == root) return 0;
        return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
    }

    public static void main(String[] args) {
//        TreeNode<Integer> root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))); //true
        TreeNode<Integer> root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2)); //false
//        TreeNode<Integer> root = new TreeNode(1, new TreeNode(1, new TreeNode(1, new TreeNode(1), null), null), null); //false
        System.out.println(isBalanced(root));
    }
}
