package competitiveCoding.BST;

import com.sun.source.tree.Tree;

public class BasicBSTOps {
    TreeNode root;

    public BasicBSTOps(){
        root=null;
    }

    public static void main(String[] args) {
        BasicBSTOps tree = new BasicBSTOps();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        tree.inOrderTraversal();
        TreeNode node =tree.findLCA(tree.root,30,60);
        System.out.println("");
        System.out.println("LCA: "+node.data);
        System.out.println("");
        tree.inOrderTraversal();
//        tree.inOrderSuccessor(tree.root.left.right);
    }

    public TreeNode findLCA(TreeNode node, int n1,int n2){
        if(node==null)
            return null;
        if(n1<node.data && n2< node.data)
            return findLCA(node.left, n1,n2);
        if(n1>node.data && n2> node.data)
            return findLCA(node.right, n1,n2);
        return node;
    }

    public void preOrderTraversal(){
        System.out.println();
        System.out.println("PreOrder Traversal");
        preOrder(root);
    }

    public void inOrderTraversal(){
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
    }

    public void postOrderTraversal(){
        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrder(root);
    }

    public void preOrder(TreeNode root){
        if(root!=null) {
            System.out.print(root.data + ",");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root){
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data + ",");
            inOrder(root.right);
        }
    }

    public void postOrder(TreeNode root){
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + ",");
        }
    }

    public void insert(int data){
        root = insertRecord(root,data);
    }

    public TreeNode insertRecord(TreeNode root, int data){
        if(root==null){
            root = new TreeNode(data);
            return root;
        }
        if(data< root.data) {
            root.left= insertRecord(root.left, data);
        }else{
            root.right= insertRecord(root.right,data);
        }
        return root;
    }
}
