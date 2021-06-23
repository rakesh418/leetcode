package linkedList;

public class LinkedListUtil {
    public static Node getLinkedList(int[] array) {
        Node root=null;
        Node temp=null;
        for(int i=0; i<array.length;i++){
            Node newNode = new Node(array[i]);
            if(root==null){
                root = newNode;
                temp=root;
            }else{
                temp.next = newNode;
                temp=temp.next;
            }
        }
        return root;
    }

    public static void display(Node root){
        while(root !=null){
            System.out.print(root.data +" ");
            root=root.next;
        }
    }
}
