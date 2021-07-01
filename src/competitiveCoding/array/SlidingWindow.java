package competitiveCoding.array;
/*
Given an array and an integer K, find the maximum for each and every contiguous subarray of size k.
Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
 */

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 7};
        int k =3;
        Deque<Integer> deque = new LinkedList<>();
        int i=0;
        for(i=0; i <k;i++){
            while(!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.println(deque);

        for(;i<arr.length;i++){
            System.out.print(arr[deque.peekFirst()]+",");
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[i]>deque.peekLast())
                deque.removeLast();
            deque.add(i);
        }
        System.out.println("*");
        System.out.println(arr[deque.peek()]);
    }
}
