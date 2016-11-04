package sg.kristjan.ctci.ch01;


import java.util.ArrayList;

public class StringBuilder {
    private ArrayList<Character> list;

    public StringBuilder() {
        list = new ArrayList<>();
    }

    public void add(String s) {
        for (char c : s.toCharArray()) {
            list.add(c);
        }
    }

    public String toString() {
        char[] characters = new char[list.size()];
        Character[] arr = list.toArray(new Character[list.size()]);

        for (int i = 0; i < arr.length; i++) {
            characters[i] = arr[i];
        }
        return new String(characters);
    }
}
