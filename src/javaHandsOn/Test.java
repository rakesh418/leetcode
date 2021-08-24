package javaHandsOn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("adsf1","qwe1");
        map.put("adsf2","qwe2");
        map.put("adsf3","qwe3");
        map.put("adsf4","qwe4");
        System.out.println(map.entrySet());
        for(Map.Entry<String,String> set: map.entrySet()){
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }
        Consumer;
        Supplier;
        Predicate;
        Function()

    }
}
