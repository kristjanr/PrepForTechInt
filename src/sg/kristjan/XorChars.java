package sg.kristjan;

public class XorChars {
    public static void main(String[] args) {
        String thisisanimportantthingy = "foobar";
        String thisisanimportantthingytoo = "barxfoo";
        char charr = 0;
        for (char c : thisisanimportantthingy.toCharArray()) {
            charr ^= c;
        }
        for (char c : thisisanimportantthingytoo.toCharArray()) {
            charr ^= c;
        }
        System.out.println(charr);
    }
}
