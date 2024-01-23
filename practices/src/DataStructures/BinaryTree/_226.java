package DataStructures.BinaryTree;

//https://leetcode.com/problems/invert-binary-tree/

import com.sun.source.tree.Tree;

import java.util.Stack;

public class _226 {
    public static TreeNode invertTree(TreeNode root) {
        if(null == root) return null;
        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
//        invert(root);
        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        Stack<TreeNode<Integer>> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if(null == current) continue;

            TreeNode tempLeft = current.left;
            current.left = current.right;
            current.right = tempLeft;

            stack.add(current.left);
            stack.add(current.right);
        }

        return root;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(2, new TreeNode(1), new TreeNode(3));
//        root = invertTree(root);
        root = invertTree2(root);
        System.out.println(root);//2,3,1
    }
}
