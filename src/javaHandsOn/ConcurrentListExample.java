package javaHandsOn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

//        Iterator<String> iterator = list.iterator();
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("List is : "+list);
            String str= iterator.next();
            list.add("6"); //concurrent modification exception
            if(str.equals("4")) list.remove("4");
        }
        System.out.println(list);
    }
}
