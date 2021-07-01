package competitiveCoding.linkedList;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheEntry{
    int key;
    String value;

    CacheEntry(int key, String value){
        this.key=key;
        this.value = value;
    }
}

public class LRUCache{
    int cacheSize;
    Deque<CacheEntry> deque;
    Map<Integer,CacheEntry> map;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.deque = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public String getFromCache(int key){
        if(map.containsKey(key)){
            CacheEntry entry = map.get(key);
            deque.remove(entry);
            deque.addFirst(entry);
            System.out.println("CacheHIT: "+ key);
            return entry.value;
        }
        return null;
    }

    public void putIntoCache(int key, String value){
        if(map.containsKey(key)){
            CacheEntry entry = map.get(key);
            deque.remove(entry);
            System.out.println("CacheHIT Existing: "+ key);
        }else{
            if(deque.size()==cacheSize){
                CacheEntry entryTobeRemoved=deque.removeLast();
                map.remove(entryTobeRemoved.key);
                System.out.println("CacheRemoved: "+ entryTobeRemoved.key);
            }
        }
        CacheEntry newEntry = new CacheEntry(key,value);
        deque.addFirst(newEntry);
        map.put(key,newEntry);
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "cacheSize=" + cacheSize +
                ", deque=" + deque +
                ", map=" + map +
                '}';
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.putIntoCache(1,"product 1-info");
        lruCache.putIntoCache(2,"product 2-info");
        lruCache.putIntoCache(3,"product 3-info");
        lruCache.putIntoCache(4,"product 4-info");
        lruCache.putIntoCache(2,"product 4-info");
        lruCache.putIntoCache(5,"product 4-info");
        System.out.println(lruCache.deque);

    }
}
