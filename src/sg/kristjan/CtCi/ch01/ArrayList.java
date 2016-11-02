package sg.kristjan.CtCi.ch01;

class ArrayList {
    private static final int DEFAULT_INITIAL_SIZE = 10;
    private Object[] arr;
    private int size = 0;

    public ArrayList() {
        arr = new Object[DEFAULT_INITIAL_SIZE];

    }

    public String toString() {
        String txt = "[";
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                txt += ",";
            }
            txt += arr[i];
        }
        txt += "]";
        return txt;
    }

    ArrayList(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal size: " +
                    initialSize);
        }
        arr = new Object[initialSize];
    }

    void add(Object o) {
        if (size == arr.length) {
            Object[] newArr = new Object[2 * arr.length];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        size += 1;
        arr[size - 1] = o;
    }

    void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + "Index: " + index + ", Size: " + size);
        }
        arr[index] = null;
        // not last element was removed
        if (index != size - 1) {
            System.arraycopy(arr, index + 1, arr, index, size - 1 - index);
        }
        arr[size - 1] = null;
        size -= 1;
    }

}
