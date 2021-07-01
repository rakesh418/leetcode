package competitiveCoding.array;

import java.time.Instant;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.offer(1);
        queue.add(1);
        System.out.println(queue);
        System.out.println(queue.poll());

    }
}
