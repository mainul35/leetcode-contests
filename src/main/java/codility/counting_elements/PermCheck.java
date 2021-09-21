package codility.counting_elements;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = new int[] {4, 1, 3, 2};
        System.out.println (solution (A));
    }

    public static int solution(int[] A) {
        int[] counter = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) return 0;
            counter[i] = 0;
        }
        for (int i = 1; i <= A.length; i++) {
            counter[A[i-1]]++;
            if (counter[A[i-1]] > 1) {
                return 0;
            }
        }
        return 1;
    }
}
