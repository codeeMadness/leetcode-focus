package DataStructures.BinaryTree;

//https://leetcode.com/problems/leaf-similar-trees/description/

public class _872 {

    private static void helper(TreeNode<Integer> root, StringBuilder res) {
        if(root != null && root.left == null && root.right == null) {
            res.append(root.val);
            res.append(",");
        }
        if(root.left != null)
            helper(root.left, res);
        if(root.right != null)
            helper(root.right, res);

    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder res1 = new StringBuilder();
        helper(root1, res1);
        StringBuilder res2 = new StringBuilder();
        helper(root2, res2);
        return res1.compareTo(res2) == 0;

    }

    public static void main(String[] args) {
//        TreeNode<Integer> root1 =
//                new TreeNode<>(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)))
//                        , new TreeNode(1, new TreeNode(9), new TreeNode(8)));
//
//        TreeNode<Integer> root2 =
//                new TreeNode<>(3, new TreeNode(5, new TreeNode(6), new TreeNode(7))
//                        , new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        TreeNode<Integer> root1 = new TreeNode<>(1, new TreeNode(2), new TreeNode(3));
        TreeNode<Integer> root2 = new TreeNode<>(1, new TreeNode(3), new TreeNode(2));

        System.out.println(leafSimilar(root1, root2));
    }
}
