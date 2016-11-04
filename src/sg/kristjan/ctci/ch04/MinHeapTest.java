package sg.kristjan.ctci.ch04;

public class MinHeapTest {
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();

        mh.insert(1);
        System.out.println("Insert 1");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(2);
        System.out.println("Insert 2");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(0);
        System.out.println("Insert 0");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(3);
        System.out.println("Insert 3");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(4);
        System.out.println("Insert 4");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(5);
        System.out.println("Insert 5");
        System.out.println(mh);
        System.out.println(mh.rightMost);

        mh.insert(-1);
        System.out.println("Insert -1");
        System.out.println(mh);
        System.out.println(mh.rightMost);
    }
}
