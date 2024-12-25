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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;

        while(!q.isEmpty()){

            int max=Integer.MIN_VALUE;
            int s =q.size();
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                max=Math.max(max,node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);

            }
            ans.add(max);
        }
        return ans;
    }
}