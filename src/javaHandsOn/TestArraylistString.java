package javaHandsOn;

import java.util.*;

public class TestArraylistString {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Cricket");
        list.add("Soccer");
        list.add("Hocky");
        list.add("Hocky");
        list.add("Chess");
        list.add("Badminton");
        list.add("Badminton");
        list.add("Badminton");
//        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
//        list.sort((a,b)->a.length()-b.length());
        System.out.println(list);
//        for(String item : list){
//            System.out.println(item);
//        }

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Collections.unmodifiableList(list);
        Iterator<String> listIterator = list.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

//        list = Collections.synchronizedList(list);
//        list = Collections.synchronizedCollection(list);
//        list = Collections.synchronizedSet(list);
//        list = Collections.synchronizedMap(list);
//        Collections.synchronizedSortedMap();
//        Collections.synchronizedSortedSet();
    }
}
