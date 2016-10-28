package sg.kristjan.CtCi.ch3.ex3_3;

/**
 * Created by kristjanroosild on 23/10/16.
 */
public class QuestionA {
    public static void main(String[] args) {
        StackOfPlatesA sop = new StackOfPlatesA();
        sop.push(1);
        sop.push(2);
        sop.push(3);
        System.out.println(sop.pop());
        System.out.println(sop.pop());
        System.out.println(sop.pop());
    }
}
