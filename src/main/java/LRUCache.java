import java.util.LinkedHashMap;

/**
 * @author Wallace
 */
public class LRUCache {
    /**
     * Capacity of the cache
     */
    int capacity;
    /**
     * Basic struct of LRU cache, the LinkedHashMap
     */
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();

    /**
     * Constructor
     * @param capacity capacity of the cache
     */
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Get the item based on the key
     * @param key key of item
     * @return
     */
    public int get (int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        //Make item most recently used
        makeRecent(key);
        //return the value of the item
        return cache.get(key);

    }

    /**
     * Put item into LRU Cache
     * @param key key of the item
     * @param value value of the item
     */
    public void put (int key, int value) {
        if (cache.containsKey(key)) {
            //update the item value
            cache.put(key,value);
            //make this item to be most recently used
            makeRecent(key);
            return;
        }
        //capacity limit reached
        if (cache.size() >= this.capacity) {
            //remove the least recently used
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        //add key to the last (most recently used)
        cache.put(key,value);
    }

    /**
     * Make the item to be the most recently used (add to the tail of thhe list)
     * @param key key of the item
     */
    public void makeRecent(int key) {
        int val = cache.get(key);
        //remove the key and add it to the tail of the list (most recently used)
        cache.remove(key);
        cache.put(key,val);
    }

}
