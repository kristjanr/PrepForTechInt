package sg.kristjan.CtCi.ch1.ex;


import sg.kristjan.CtCi.ch1.ex.e1_1.Question;

public class Main {
    public static void main(String[] args) {
        System.out.println(Question.isUnique("tere"));
        System.out.println(Question.isUnique("tare"));

        System.out.println(Question.isUnique2("a"));
        System.out.println(Question.isUnique2("aa"));
        System.out.println(Question.isUnique2("ab"));
        
        System.out.println(Question.isUniqueChars("ab"));

        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_2.Question.isPermutation1("", ""));
        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_2.Question.isPermutation1("", "a"));
        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_2.Question.isPermutation1("foo", "ofo"));

        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_3.Question.urlify(" foo  "));
        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_3.Question.urlify(" foo bar       "));

        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_4.Question.isPermOfPalindrome("saippuakivikauppias"));
        System.out.println(sg.kristjan.CtCi.ch1.ex.e1_4.Question.isPermOfPalindrome2("saippuakivikauppias"));

    }
}
