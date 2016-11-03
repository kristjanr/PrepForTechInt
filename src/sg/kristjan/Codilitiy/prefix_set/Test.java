package sg.kristjan.Codilitiy.prefix_set;


public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = new int[]{2, 2, 1, 0, 1};
        assert 3 == s.solution(arr);

        int[] arr1 = new int[]{};
        assert 0 == s.solution(arr1);

        int[] arr2 = new int[]{2};
        assert 0 == s.solution(arr2);

        int[] arr3 = new int[]{2, 2};
        assert 0 == s.solution(arr3);
    }
}
