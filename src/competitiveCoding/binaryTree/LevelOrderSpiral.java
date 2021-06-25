package competitiveCoding.binaryTree;

import java.util.Stack;

public class LevelOrderSpiral {
    TreeNode root;
    public static void main(String[] args) {
        LevelOrderSpiral tree = new LevelOrderSpiral();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.printLevelOrderSpiral();
    }

    private void printLevelOrderSpiral() {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while(!stack1.isEmpty()){
                TreeNode pop = stack1.pop();
                System.out.println(pop.data);
                if(pop.right!=null){
                    stack2.push(pop.right);
                }
                if(pop.left!=null){
                    stack2.push(pop.left);
                }
            }

            while(!stack2.isEmpty()){
                TreeNode pop = stack2.pop();
                System.out.println(pop.data);
                if(pop.left!=null){
                    stack1.push(pop.left);
                }
                if(pop.right!=null){
                    stack1.push(pop.right);
                }
            }

        }
    }


}
