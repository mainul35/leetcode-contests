package codility.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        var A = new int[]{3, 8, 9, 7, 6};
        var K = 3;

//        var A = new int[]{5, -1000};
//        var K = 1;
//        var ret = solution (A, K);
        System.out.println (Arrays.toString (solution (A, K)));
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
        if (A == null || A.length == 0) return A;
        var len = A.length;
        var n = len % K;
        if (n == 0) return A;
        var res = new int[len];
        for (int i = 0; i < len; i++) {
            res[(i+K) % len] = A[i]; // 5%2 = 3, 6%2 = 0
        }
        return res;
    }
}
