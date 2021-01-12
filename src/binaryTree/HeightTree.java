package binaryTree;

public class HeightTree {
    TreeNode root;
    public static void main(String[] args) {
        HeightTree tree = new HeightTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
//        tree.root.right.right.right = new TreeNode(8);
//        tree.root.right.right.right.left = new TreeNode(9);
//        tree.root.right.right = new TreeNode(7);
//        System.out.println(tree.height(tree.root));
        tree.printLevelOrder();
    }


    public void printLevelOrder(){
        int height = height(root);
        System.out.println(height);
        for(int i=1; i<=height;i++){
            printGivenLevel(root,i);
            System.out.println();
        }
    }

    public void printGivenLevel(TreeNode node, int level){
        if(node==null)
            return;
        if(level==1){
            System.out.print(node.data);
        }else if(level>1){
            printGivenLevel(node.left, level-1);
            printGivenLevel(node.right, level-1);
        }

    }

    public int height(TreeNode node){
        if(node==null)
            return 0;
        else{
            int lHeight = height(node.left);
            int rHeight = height(node.right);
            return (lHeight>=rHeight)?(lHeight+1):(rHeight+1);
        }
    }
}
