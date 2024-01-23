package DataStructures.BinaryTree;

//https://leetcode.com/problems/binary-tree-postorder-traversal/description/

import java.util.ArrayList;
import java.util.List;

public class _145 {
    public static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        postOrder(result, root);
        return result;
    }

    private static void postOrder(List<Integer> result, TreeNode<Integer> root) {
        if(root == null) return;
        postOrder(result, root.left);
        postOrder(result, root.right);
        result.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode<>(3, new TreeNode(6), null));
        postorderTraversal(root).forEach(System.out::println); //[4,5,2,6,3,1]
    }
}
