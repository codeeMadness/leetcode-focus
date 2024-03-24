package DataStructures.BinaryTree;

//https://leetcode.com/problems/diameter-of-binary-tree/description/

public class _543 {

    int ans = 0;

    public int dfs(TreeNode<Integer> node) {
        if(null == node) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode<Integer> root) {
        dfs(root);
        return ans;
    }

}
