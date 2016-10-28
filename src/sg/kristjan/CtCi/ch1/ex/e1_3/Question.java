package sg.kristjan.CtCi.ch1.ex.e1_3;


public class Question {
    public static String urlify(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') continue;
            System.arraycopy(arr, i + 1, arr, i + 3, arr.length - i - 3);
            arr[i] = '%';
            arr[i + 1] = '2';
            arr[i + 2] = '0';
        }
        return new String(arr);
    }
}