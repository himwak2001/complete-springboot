package tester;

import utils.LruCache;

public class Test1 {
    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<>(3);
        cache.put(1, "One");
        cache.printCache();

        cache.put(2, "Two");
        cache.printCache();

        cache.put(3, "Three");
        cache.printCache();

        cache.get(1); // Access key 1
        cache.printCache();

        cache.put(4, "Four"); // Triggers LRU removal
        cache.printCache();

        cache.get(2); // Should be a miss (key 2 was evicted)
        cache.printCache();

        cache.get(3);
        cache.printCache();

        cache.put(5, "Five"); // Triggers another LRU removal
        cache.printCache();
    }
}
