package BST;

public class PreOrderToPostOderBST {

    static TreeNode root =null;

    public static void printPostBST(int[] preOrderBST, int start, int end){
//        System.out.print(start + " ");
//        System.out.println(end);
        if(start>end){
            return;
        }
        int element = preOrderBST[start];
        int index=start;
        while(index<=end){
            if(element<preOrderBST[index]){
                break;
            }else{
                index++;
            }
        }
        int pivot = index;

        printPostBST(preOrderBST,start+1,pivot-1);
        printPostBST(preOrderBST,pivot,end);
        System.out.print(preOrderBST[start] + " ");
    }

    public static TreeNode constructBSTTree(TreeNode node, int[] preOrderBST, int start, int end){
        if(start>end){
            return null;
        }
        int element = preOrderBST[start];
        int index=start;
        while(index<=end){
            if(element<preOrderBST[index]){
                break;
            }else{
                index++;
            }
        }
        int pivot = index;
        node = new TreeNode(preOrderBST[start]);
        node.left = constructBSTTree(node, preOrderBST,start+1,pivot-1);
        node.right= constructBSTTree(node, preOrderBST,pivot,end);

        return node;
    }

    public static void main(String[] args) {
        int[] preOrderBST = {70,35,30,31,40,39,45,50,46,85,71,86,87,88};
//        printPostBST(preOrderBST,0,preOrderBST.length-1);

        TreeNode node = constructBSTTree(root, preOrderBST,0,preOrderBST.length-1);
        System.out.println(node.left.right.left.data);
    }
}
