package DataStructures.BinaryTree;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/

import java.util.ArrayList;
import java.util.List;

public class _94 {
    public static List<Integer> inorderTraversal(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        inOrder(result, root);
        return result;
    }

    private static void inOrder(List<Integer> result, TreeNode<Integer> root) {
        if(null == root) return;
        inOrder(result, root.left);
        result.add(root.val);
        inOrder(result, root.right);
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode<>(3, new TreeNode(6), null));
        inorderTraversal(root).forEach(System.out::println); //425163
    }
}
