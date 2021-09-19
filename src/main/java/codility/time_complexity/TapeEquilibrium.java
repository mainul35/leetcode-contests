package codility.time_complexity;

import java.util.Arrays;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 2};
        System.out.println (solution (A));
    }

    // O(N*N) complexity
    public static int solution(int[] A) {

        if (A.length == 0) return 0;
        if (A.length == 1) return A[0];
        if (A.length == 2) return Math.abs (A[1] - A[0]);
        int pivot = 1;
        int i = 0, j = pivot;
        int end = A.length - 1;
        int leadingTape = 0, trailingTape = 0;
        int min = 1001;

        while (pivot != A.length) {
            if (i < pivot) {
                leadingTape += A[i++];
            }

            if (j <= end) {
                trailingTape += A[j++];
            }

            if (i == pivot && j == A.length) {
                pivot++;
                i = 0;
                j = pivot;
                int temp = Math.abs (trailingTape - leadingTape);
                trailingTape = 0;
                leadingTape = 0;
                if (min > temp) {
                    min = temp;
                }
            }
        }
        return min;
    }

}
