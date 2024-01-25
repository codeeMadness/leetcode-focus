package DataStructures.BinaryTree;

//https://leetcode.com/problems/merge-two-binary-trees/

public class _617 {

    public static TreeNode<Integer> mergeTrees(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode new_node = new TreeNode(root1.val + root2.val);

        new_node.left = mergeTrees(root1.left, root2.left);
        new_node.right = mergeTrees(root1.right, root2.right);

        return new_node;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root1 = new TreeNode<>(1, new TreeNode(3, new TreeNode(5) , null), new TreeNode(2));
        TreeNode<Integer> root2 = new TreeNode<>(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode<Integer> newRoot = mergeTrees(root1, root2);
        System.out.println(newRoot);

    }
}
