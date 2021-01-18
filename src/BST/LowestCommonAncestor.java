package BST;

public class LowestCommonAncestor {

    public static int count = 0;

    public static TreeNode findLCA(TreeNode node, int n1, int n2){
        if(node.data>n1 && node.data>n2)
            return findLCA(node.left,n1,n2);
        if(node.data<n1 && node.data<n2)
            return findLCA(node.right,n1,n2);
        return node;
    }

//    public static TreeNode kthSmallest(TreeNode node, int k){
//        if(node==null)
//            return null;
//
//        TreeNode left = kthSmallest(node.left,k);
//
//
//
//    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(20);
        node.left = new TreeNode(8);
        node.right = new TreeNode(22);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(12);
        node.left.right.left = new TreeNode(10);
        node.left.right.right = new TreeNode(14);
        System.out.println(findLCA(node,14,41).data);

    }
}
