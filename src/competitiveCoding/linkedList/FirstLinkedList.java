package competitiveCoding.linkedList;

//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data=data;
//        this.next =null;
//    }
//}

public class FirstLinkedList {

    Node head;

    public FirstLinkedList(){
        head=null;
    }

    public void insertEnd(int data){
        if(head==null){
            head=new Node(data);
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=new Node(data);
        }
    }

    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        FirstLinkedList linkedList = new FirstLinkedList();
        linkedList.insertEnd(1);
        linkedList.insertEnd(2);
        linkedList.insertEnd(3);
        linkedList.insertFront(4);
        linkedList.printList();
    }
}
