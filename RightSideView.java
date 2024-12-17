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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null)
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t=null;
            int s = q.size();
            for(int i=0;i<s;i++){
               t=q.poll();
               if(t.left!=null)
               q.offer(t.left);
               if(t.right!=null)
               q.offer(t.right);
            }
            l.add(t.val);
        }
        return l;
    }
}