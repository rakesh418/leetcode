package binaryTree;

class TreeNode{
    int data;
    TreeNode left , right;

    public TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class BinaryTreeEx {
    TreeNode root;

    public void printInOrder(){
        printInOrder(root);
    }
    public void printPreOrder(){
        printPreOrder(root);
    }

    public void printPostOrder(){
        printPostOrder(root);
    }

    public void printInOrder(TreeNode node){
        if(node==null)
            return;
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }
    public void printPreOrder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printPostOrder(TreeNode node){
        if(node==null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        BinaryTreeEx tree = new BinaryTreeEx();
        tree.root = new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(3);
        tree.root.left.left=new TreeNode(4);
        tree.root.left.right=new TreeNode(5);
        tree.root.right.left=new TreeNode(6);
        tree.root.right.right=new TreeNode(7);
        tree.printInOrder();
        System.out.println("-----");
        tree.printPreOrder();
        System.out.println("-----");
        tree.printPostOrder();

    }
}
