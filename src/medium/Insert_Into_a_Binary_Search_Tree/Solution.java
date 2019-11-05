package medium.Insert_Into_a_Binary_Search_Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null) {
            return new TreeNode(val);
        }

        TreeNode currentNode = root;

        while(currentNode != null) {
            if(val < currentNode.val) {
                if(currentNode.left == null) {
                    TreeNode leftChild = new TreeNode(val);
                    currentNode.left = leftChild;
                    return root;
                }
                currentNode = currentNode.left;
            } else {
                if(currentNode.right == null) {
                    TreeNode rightChild = new TreeNode(val);
                    currentNode.right = rightChild;
                    return root;
                }
                currentNode = currentNode.right;
            }
        }

        return root;

    }
}
