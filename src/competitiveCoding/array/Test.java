package competitiveCoding.array;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        System.out.println(deque);
        deque.addLast(7);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.add(24);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        System.out.println(deque.peek());

    }
}
