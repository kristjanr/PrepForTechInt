package sg.kristjan.ctci.ch01;


import java.util.LinkedList;

class HashTable<K, V> {
    private LinkedList<Pair>[] arr;
    private int size;

    public HashTable() {
        arr = new LinkedList[1000];
        size = 0;
    }

    public String toString(){
        String txt = "";
        for (LinkedList<Pair> l : arr){
            if (l==null) continue;
            for (Pair p : l) {
                if (p==null) continue;
                txt += p ;
            }
        }
        return txt;
    }

    public void put(K key, V value) {
        LinkedList<Pair> list = getList(key);
        Pair pair = new Pair(key, value);
        Pair oldPair = findPair(key, list);
        if (oldPair != null) {
            list.remove(oldPair);
        }
        list.add(pair);
        size += 1;
    }

    public V get(K key) {
        LinkedList<Pair> list = getList(key);
        Pair pair = findPair(key, list);
        if (pair != null) return pair.getValue();

        return null;
    }

    public V remove(K key) {
        LinkedList<Pair> list = getList(key);
        Pair pair = findPair(key, list);
        if (pair != null) {
            list.remove(pair);
            size -= 1;
            return pair.getValue();
        }

        return null;
    }

    private LinkedList<Pair> getList(K key) {
        int hash = key.hashCode();
        int index = hash % arr.length;
        if (arr[index] == null) {
            arr[index] = new LinkedList<>();
        }
        return arr[index];
    }

    private Pair findPair(K key, LinkedList<Pair> pairs) {
        for (Pair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    private class Pair {
        private K key;

        private V value;

        public String toString(){
            return "(" + key + ", " + value + ")";
        }

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }


        V getValue() {
            return value;
        }

    }

}
