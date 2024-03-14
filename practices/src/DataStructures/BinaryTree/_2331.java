package DataStructures.BinaryTree;

//https://leetcode.com/problems/evaluate-boolean-binary-tree/description/

public class _2331 {

    public static boolean evaluateTree(TreeNode<Integer> root) {
        if(root == null) return false;
        if(root.val == 2)
            return evaluateTree(root.left) || evaluateTree(root.right);
        if(root.val == 3)
            return evaluateTree(root.left) && evaluateTree(root.right);

        return root.val == 1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(2, new TreeNode(1), new TreeNode(3, new TreeNode(0), new TreeNode(1)));
        System.out.println(evaluateTree(root)); //true
    }
}
