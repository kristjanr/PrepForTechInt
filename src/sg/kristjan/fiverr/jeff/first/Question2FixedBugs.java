package sg.kristjan.fiverr.jeff.first;

import java.util.HashMap;

/**
 * Created by kristjan on 9/11/16.
 * Design and build a "least recently used" cache, which evicts the least recently used item.
 * The cache should map from keys to values (allowing you to insert and retrieve a value
 * associated with a particular key) and be initialized with a max size. When it is full,
 * it should evict the least recently used item.
 */


class Node {
    Node newer;
    Node older;
    Integer key;
    Integer value;

    public Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}


class Cache {
    private Node leastRecentlyUsed;
    private Node mostRecentlyUsed;
    private HashMap<Integer, Node> nodes = new HashMap<>();
    private int size;


    public Cache(int size) {
        this.size = size;
    }

    public Integer get(int key) {
        Node node = nodes.get(key);
        if (node == null) {
            return null;
        }
        if (node.older != null) {
            node.older.newer = node.newer;
        }
        if (node.newer != null) {
            node.newer.older = node.older;
        }
        node.older = mostRecentlyUsed;

        if (mostRecentlyUsed != null) {
            mostRecentlyUsed.newer = node;
        }
        mostRecentlyUsed = node;
        return node.value;
    }

    public void put(int key, int value) {
        Node node = nodes.get(key);
        if (node == null) {
            node = new Node(key, value);

            if (leastRecentlyUsed == null) {
                leastRecentlyUsed = node;
            }

            nodes.put(key, node);

            if (nodes.size() > size) {
                nodes.remove(leastRecentlyUsed.key);
                if (leastRecentlyUsed.newer != null) {
                    leastRecentlyUsed.newer.older = null;
                }
                leastRecentlyUsed = leastRecentlyUsed.newer;
            }
        } else if (node.value != value) {
            node.value = value;
            nodes.put(key, node);
        }
        get(key);
    }
}

public class Question2FixedBugs {
    public static void main(String[] args) {
        Cache c = new Cache(2);
        c.put(1, 1);
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        c.put(2, 2);
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        c.put(3, 3);
        c.put(4, 4);
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        System.out.println(c.get(3));
        System.out.println(c.get(4));
    }

}