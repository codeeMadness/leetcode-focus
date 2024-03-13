package DataStructures.BinaryTree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class _104 {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    //TODO: taily recursion

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root));
    }
}
