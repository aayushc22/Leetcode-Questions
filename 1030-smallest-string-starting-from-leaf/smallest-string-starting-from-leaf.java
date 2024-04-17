/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private String smallestOrder = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallestOrder;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) {
            return;
        }

        // Append the current node's character to the path
        path.append((char) ('a' + node.val));

        // If it's a leaf node, reverse the path and update smallestOrder if necessary
        if (node.left == null && node.right == null) {
            String currentPath = path.reverse().toString();
            path.reverse(); // Restore path back to original state for future iterations

            if (smallestOrder == null || currentPath.compareTo(smallestOrder) < 0) {
                smallestOrder = currentPath;
            }
            path.deleteCharAt(path.length() - 1);
            return;
        }

        // Recursively traverse left and right subtrees
        dfs(node.left, path);
        dfs(node.right, path);

        // Backtrack: remove the last character when returning from recursion
        path.deleteCharAt(path.length() - 1);
    }
}