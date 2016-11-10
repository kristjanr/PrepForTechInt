package sg.kristjan.fiverr.jeff.first;

/**
 * Created by kristjan on 9/11/16.
 * Design and build a "least recently used" cache, which evicts the least recently used item.
 * The cache should map from keys to values (allowing you to insert and retrieve a value
 * associated with a particular key) and be initialized with a max size. When it is full,
 * it should evict the least recently used item.
 */
/*

class Node {
    Node newer;
    Node older;
    int value;
}


public class Cache {
    Node leastRecentlyUsed;
    Node recentlyUsed;
    HashMap<int, Node> nodes = new HashMap<>();
    int allowedItems;


    public Cache(int allowedItems) {
        this.allowedItems = allowedItems;
    }

    public int get(int key) {
        Node node = nodes.get(key);
        if (node == null) {
            return null;
        }
        Node older = node.older;
        older.newer = node.newer;
        node.newer.older = older;
        node.older = recentlyUsed;


        recentlyUsed.newer = node;
        recentlyUsed = node;
        return node.value;
    }


    public void put(int key, int value) {
        Node node = nodes.get(key);
        if (node == null) {
            node = Node(key, value);
            nodes.put(key, node);
            if (nodes.size() > allowedItems) {
                leastRecentlyUsed.newer.older = null;
                leastRecentlyUsed = leastRecentlyUsed.newer;
                nodes.remove(key);
            }
        }
        return get(key);
    }
}*/
