package DataStructures.BinaryTree;

//https://leetcode.com/problems/binary-tree-preorder-traversal/description/


import java.util.ArrayList;
import java.util.List;

public class _144 {
    public static List<Integer> preorderTraversal(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        preorder(result, root);
        return result;
    }

    private static void preorder(List<Integer> result, TreeNode<Integer> root) {
        if(null == root)
            return;
        result.add(root.val);
        preorder(result, root.left);
        preorder(result, root.right);
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1, null, new TreeNode(2, new TreeNode(3), null));
        preorderTraversal(root).forEach(System.out::println);
    }
}
