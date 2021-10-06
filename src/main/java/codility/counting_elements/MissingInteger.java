package codility.counting_elements;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
//        int[] A = new int[] {1, 3, 6, 4, 1, 2};
//        int[] A = new int[] {1, 2, 3};
//        int[] A = new int[] {-1, -3};
//        int[] A = new int[] {-1000000, 1000000};
        int[] A = new int[] {-1, 1, 2, 3, 4, 5};
        System.out.println (solution (A));
    }

    // Sorting the array to order according to smallest to largest
    // then handling the corner cases first
    // in while loop, setting the counter to work with the positive integers only [for avoiding TLE]
    // In the for loop, doing some magic :P
    public static int solution(int[] A) {
        int c = 0;
        Arrays.sort (A);

        if (A[c] > 1) return 1;

        if (A[A.length - 1] < 0)
            return 1;

        while (A[c] < 0) {
            c++;
        }

        for (; c < A.length; c++) {
            if (c - 1 > -1 && A[c] - A[c-1] > 1) {
                if (A[c-1] > 0)
                    return A[c-1] + 1; // if the element is in the middle
                else if (A[c] > 0 && A[c] != 1) {
                    return 1; // If the first element starts from > 1
                }
            }
        }

        return A[c - 1] + 1; // If none found within the array, return the last value + 1
    }
}
