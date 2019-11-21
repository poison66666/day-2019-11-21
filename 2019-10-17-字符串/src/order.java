import java.util.Stack;

public class order {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public void postOrderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode last = null;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.peek();
            if(top == null || top.right == last){
                System.out.println(top.val);
                stack.pop();
                last = top;
            }else{
                cur = top.right;
            }
        }
    }
}
