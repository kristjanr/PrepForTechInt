package sg.kristjan.CtCi.ch02.ex.ex2_1;

import java.util.LinkedList;

/**
 * Created by kristjanroosild on 21/10/16.
 */
public class QuestionB<T> {

    public LinkedList<T> removeDupes(LinkedList<T> list) {

        for (int i = 0; i < list.size(); i++) {
            T oi = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                T oj = list.get(j);
                if (oi == oj) {
                    list.remove();
                }
            }
        }
        return list;

    }
}
