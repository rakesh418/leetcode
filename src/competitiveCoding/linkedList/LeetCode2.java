package competitiveCoding.linkedList;

public class LeetCode2 {

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

    public static void main(String[] args) {
        int[] array1 ={2,4,3,9};
        int[] array2 ={5,6,6};

        Node l1 = getLinkedList(array1);
        Node l2 = getLinkedList(array2);
        Node finalList = addTwoNumbers(l1,l2);
        System.out.println();
    }

    private static Node addTwoNumbers(Node l1, Node l2) {
        Node root=null;
        Node temp=root;
        int rem=0;
        int sum=0;
        while(l1!=null || l2!=null || rem!=0){
            int f1 = (l1!=null)?l1.data:0;
            int f2 = (l2!=null)?l2.data:0;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            sum = (f1+f2+rem)%10;
            rem = (f1+f2+rem)/10;
            Node newNode = new Node(sum);
            if(root==null){
                root = newNode;
                temp=root;
            }else{
                temp.next = newNode;
                temp=newNode;
            }
        }
        return root;
    }
}
