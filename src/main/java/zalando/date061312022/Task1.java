package zalando.date061312022;

public class Task1 {

    public static void main(String[] args) {
//        System.out.println(solution(new int[] {1, 2, 5, 9, 9}, 1));
//        System.out.println(solution(new int[] {1, 2, 5, 8, 9}, 9));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, -10));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 10));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 20));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 30));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 40));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 60));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 110));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 120));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 130));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 170));
        System.out.println(solution(new int[] {10, 20, 30, 40, 60, 110, 120, 130, 170}, 180));
    }
    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + (r+1)) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if (A[m] == X) return m;
            else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}
