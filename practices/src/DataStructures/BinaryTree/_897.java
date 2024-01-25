package DataStructures.BinaryTree;

//https://leetcode.com/problems/increasing-order-search-tree/description/

public class _897 {

    public static TreeNode increasingBST(TreeNode root) {
        increasingBST(root, null);
        return root;
    }

    public static TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
    }

    public static void inOrder(TreeNode dummy, TreeNode<Integer> root) {
        if(root == null) return;
        inOrder(dummy, root.left);
        dummy = root;
        inOrder(dummy.right, root.right);
    }

    public static void main(String[] args) {
        TreeNode<Integer> root =
                new TreeNode<>(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9))));
        System.out.println(increasingBST(root));

    }
}
