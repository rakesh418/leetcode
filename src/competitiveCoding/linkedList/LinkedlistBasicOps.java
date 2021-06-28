package competitiveCoding.linkedList;

import java.util.HashSet;

public class LinkedlistBasicOps {
    static Node root;
    public static void main(String[] args) {
        int[] input = {3,5,6};
        for(int i: input){
            root = insertFront(root, new Node(i));
        }
        display(root);
        System.out.println("**********");
        insertRear(root, new Node(7));
        display(root);
        System.out.println("**********");
        root.next.next.next.next=root.next;//For testing loop in a
//        detectLoop(root);
        detectLoop1(root);
//        display(root);
    }

    public static void detectLoop1(Node root){
        Node slowP = root;
        Node fastP= root;
        while(slowP!=null && fastP!=null){
            slowP=slowP.next;
            fastP = fastP.next.next;
            if(slowP==fastP){
                System.out.println("detected loop: "+slowP.data);
                break;
            }
        }
    }

    public static void detectLoop(Node root){
        HashSet<Node> hashSet = new HashSet<>();
        Node temp = root;
        while(temp!=null){
            if(hashSet.contains(temp)){
                System.out.println("detected loop: "+temp.data);
                break;
            }else{
                hashSet.add(temp);
                temp=temp.next;
            }
        }
    }

    public static void display(Node node){
        Node temp =node;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static Node insertFront(Node root, Node node){
        if(root==null){
            root=node;
        }else{
            node.next=root;
            root=node;
        }
        return root;
    }

    public static Node insertRear(Node root, Node node){
        if(root ==null){
            root=node;
        }else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }

        return root;
    }
}
