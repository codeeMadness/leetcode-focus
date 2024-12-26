package Practice.Easy;

import DataStructures.BinaryTree.TreeNode;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class _108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0, nums.length-1);
    }

    public static TreeNode convert(int[] array, int start, int last) {
        if(start > last) return null;

        int middle = start + (last-start)/2;

        TreeNode<Integer> root = new TreeNode<>(array[middle]);

        root.setLeft(convert(array, start, middle-1));
        root.setRight(convert(array,middle+1, last));

        return root;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,7};
//        int[] nums = {-10,-3,0,5,9};
//        int[] nums = {1,3};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root);
    }
}
