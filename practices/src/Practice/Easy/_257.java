package Practice.Easy;

//https://leetcode.com/problems/binary-tree-paths/description

import DataStructures.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257 {
    public static List<String> binaryTreePaths(TreeNode<Integer> root) {
        List<String> res = new ArrayList<>();
        if(null != root)
            followPath(root, "", res);
        return res;
    }

    public static void followPath(TreeNode<Integer> node, String path, List<String> res) {
        if(null == node.getLeft() && null == node.getRight()) {
            res.add(path + node.getVal());
        }
        if(null != node.getLeft())
            followPath(node.getLeft(), path + node.getVal() + "->", res);
        if(null != node.getRight())
            followPath(node.getRight(), path + node.getVal() + "->", res);
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        binaryTreePaths(root).forEach(System.out::println);
    }
}
