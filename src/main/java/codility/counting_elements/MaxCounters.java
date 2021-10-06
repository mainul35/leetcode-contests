package codility.counting_elements;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
//        int[] A = new int[] {2, 1, 1, 2, 1};
//        int N = 1;

        int[] A = new int[] {3, 4, 4, 6, 1, 4, 4};
        int N = 5;

//        int[] A = new int[] {3, 4, 4, 1, 4, 6, 4, 6};
//        int N = 6;
        System.out.println (Arrays.toString (solution (N, A)));
    }

    // Create an array of counter
    // set all initial values as 0
    // the A[i] value that will take effect on counterArr will be considered as 1 based indexed,
    // so counterArr[A[i]-1]++;
    // While inserting we will keep track of maxValue of counterArr[A[i]-1]
    // If the value of A[i] > N then will set all of counterArr[j] = A[i]
    // and set maxValue = A[i]
    public static int[] solutionShouldGetTLEForLargeTestCases(int N, int[] A) {
        int[] counterArr = new int[N];
        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                Arrays.fill (counterArr, maxValue);
            } else {
                counterArr[A[i] - 1]++;
                if (counterArr[A[i] - 1] > maxValue) {
                    maxValue = counterArr[A[i] - 1];
                }
            }
        }
        return counterArr;
    }

    // First loop will see if A[i] > N
    // then it will assign maxValue in temp
    // else it will compare the values of counter[j] + 1 and temp + 1
    // and assign the max of these 2 in counterArr[j], where j = A[i] - 1
    // Finally the maxValue will be the maximum value between maxValue and counterArr[j]
    // The 2nd loop will simply check if there is any value of counterArr that is smaller than temp
    // and assign temp in counterArr[i]
    public static int[] solution(int N, int[] A) {
        int[] counterArr = new int[N];
        int maxValue = 0;
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N+1) {
                temp = maxValue;
            } else {
                counterArr[A[i] - 1] = Math.max (counterArr[A[i] - 1] + 1, temp+1);
                maxValue = Math.max (maxValue, counterArr[A[i]-1]);
            }
        }

        for (int i = 0; i < counterArr.length; i++) {
            if (counterArr[i] < temp) {
                counterArr[i] = temp;
            }
        }
        return counterArr;
    }
}
