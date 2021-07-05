package competitiveCoding.array;

import java.time.Instant;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(12);
        System.out.println(treeSet);

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
    }
}
