package DataStructures.BinaryTree;

public class TreeNode<T> {
      T val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(T val) { this.val = val; }
      TreeNode(T val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public static <T> TreeNode convert(T[] array) {
          if(array.length == 0 || null == array[0]) return null;
          int i = 0;
          TreeNode root = new TreeNode(array[i]);

          dfs(array, root, i+1, true);
          dfs(array, root, i+2, false);

          return root;
      }

      private static <T> void dfs(T[] array, TreeNode root, int i, boolean isLeft) {
            if(i >= array.length || array[i] == null) return;

            TreeNode node = new TreeNode(array[i]);
            array[i] = null;

            if(isLeft) {
                root.left = node;
                root = root.left;
            } else {
                root.right = node;
                root = root.right;
            }

            dfs(array, root, i+1, true);
            dfs(array, root, i+2, false);
      }

      public static void main(String[] args) {
            Integer[] array = {1,null,2,3,4,5};
            TreeNode root = TreeNode.convert(array);
            System.out.println(root);
      }
}
