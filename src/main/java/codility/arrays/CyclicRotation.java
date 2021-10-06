package codility.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
//        var A = new int[]{3, 8, 9, 7, 6};
//        var K = 3;

        var A = new int[]{5, -1000};
        var K = 1;
        var ret = solution (A, K);
        System.out.println (Arrays.toString (A));
    }

    /*
    *
    * q = 4;
    * p = 3;
    * temp = A[A.length - 1]
    * A[q] = 7;
    * A[p] = 9;
    * if p < 0 -> p = A.length - 2
    * if q < 0 -> q = A.length - 1
    * itr++;
    * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
    * */

    public static int[] solution(int[] A, int K) {
        if (A.length == K) return A;

        var p = A.length - 2;
        var q = A.length - 1;
        if (q > 0) {
            var temp = A[A.length - 1];
            var itr = 0;
            while (itr < K) {
                if (p < 0) {
                    A[0] = temp;
                    itr++;
                    p = A.length - 2;
                    q = A.length - 1;
                    temp = A[A.length - 1];
                } else if (q > 0){
                    A[q] = A[p];
                    p--; q--;
                }
            }
        }
        return A;
    }
}
