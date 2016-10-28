package sg.kristjan.CtCi.ch1;


public class Main {
    public static void main(String[] args) {
        testArrayList();

        testHashTable();

        testStringBuilder();


    }

    private static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.add("");
        System.out.println(sb);
        sb.add("s");
        System.out.println(sb);
        sb.add("uu");
        System.out.println(sb);
        sb.add("r");
        System.out.println(sb);
    }

    private static void testHashTable() {
        HashTable myVeryOwn = new HashTable();
        System.out.println(myVeryOwn);
        myVeryOwn.put("Foo", "Bar");
        System.out.println(myVeryOwn);
        System.out.println(myVeryOwn);
        myVeryOwn.put("FFF", "Baz");
        System.out.println(myVeryOwn.get("Foo"));
        System.out.println(myVeryOwn.get("Fo"));

        myVeryOwn.remove("FOO");
        System.out.println(myVeryOwn);
        myVeryOwn.remove("Foo");
        System.out.println(myVeryOwn);
    }

    private static void testArrayList() {
        ArrayList arr = new ArrayList(2);
        arr.add("1");
        arr.add("2");
        System.out.println(arr);
        arr.add("3");
        System.out.println(arr);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        arr.remove(01);
        System.out.println(arr);
    }
}
