package zalando.date061312022;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2}));
        System.out.println(solution(new int[]{5, 8}));
        System.out.println(solution(new int[]{1, 1, 1, 1}));
    }

    static int solution(int[] A) {
        // write your code in Java SE 11
        int numOfSkyLines = 0;
        int skylineHeight = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > skylineHeight){
                numOfSkyLines = numOfSkyLines + (A[i] - skylineHeight);
            }
            skylineHeight = A[i];
        }
        return numOfSkyLines;
    }
}
