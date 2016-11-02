package sg.kristjan.CtCi.ch01.ex.e1_4;


import java.util.Hashtable;

public class Question {
    public static boolean isPermOfPalindrome(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') continue;
            Integer appearances = ht.get(ch);
            if (appearances == null) appearances = 0;
            ht.put(ch, appearances + 1);
        }
        int oddCount = 0;
        for (int count : ht.values()) {
            if (count % 2 == 1) {
                oddCount += 1;
            }
        }
        return oddCount == 1;
    }

    public static boolean isPermOfPalindrome2(String s) {
        boolean[] bitVector = new boolean[128];
        for (char ch : s.toCharArray()) {
            if (ch == ' ') continue;
            bitVector[ch] = !bitVector[ch];
        }
        int oddCount = 0;
        for (boolean bit : bitVector) {
            if (bit) oddCount += 1;

        }
        return oddCount == 1;
    }

}