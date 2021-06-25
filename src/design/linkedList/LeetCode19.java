package design.linkedList;

public class LeetCode19 {

    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node firstPtr = head;
        Node secondPtr = head;
        Node prev=null;
        int i=1;
        while(i<n){
            secondPtr=secondPtr.next;
            i++;
        }
        while(secondPtr.next!=null){
            prev=firstPtr;
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }

        if(firstPtr==head){
            head=head.next;
        }else{
            prev.next= firstPtr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] array1 ={2,4,3,9,6,1,8};
        Node l1 = LinkedListUtil.getLinkedList(array1);
        l1 = deleteNthNodeFromEnd(l1,3);
        LinkedListUtil.display(l1);
    }
}
