package sg.kristjan.CtCi.ch02.ex.ex2_1;

import java.util.HashSet;
import java.util.LinkedList;


public class QuestionA<T> {

    public LinkedList<T> removeDupes(LinkedList<T> list) {
        HashSet<T> set = new HashSet<>();
        for (T obj : list) {
            if (set.contains(obj)) {
                list.remove(obj);
            } else {
                set.add(obj);
            }
        }
        return list;
    }
}
