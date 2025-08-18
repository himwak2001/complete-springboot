package utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LruCache(int capacity) {
        // initial capacity of map : when to increase the map's capacity to maintain performance : to maintain entries from LRA to MRA
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // invoked by put/putAll after inserting elements : to remove the least used entries each time a new entry is added
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) { // this is the entry that will be removed if this method return true
        return size() > capacity;
    }

    public void printCache() {
        System.out.println("Current LRU Cache State: " + this);
    }
}
