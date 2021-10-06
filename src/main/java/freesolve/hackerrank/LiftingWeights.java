package freesolve.hackerrank;

public class LiftingWeights {
    public static void main(String[] args) {
        int[] testcase = {1,4,5};
        System.out.println(knapSack(10,testcase,testcase.length));
    }

    static int knapSack(int W, int wt[], int n)
    {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, n - 1);
        else
            return Math.max(wt[n-1]+knapSack(W - wt[n - 1], wt, n - 1),
                    knapSack(W, wt, n - 1));
    }
}
