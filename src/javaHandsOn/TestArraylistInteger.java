package javaHandsOn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestArraylistInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(65);
        list.add(21);
        list.add(32);
        list.add(1);
//        Collections.sort(list);
//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.stream().forEach();

    }
}
