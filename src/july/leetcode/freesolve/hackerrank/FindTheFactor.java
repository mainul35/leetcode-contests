package july.leetcode.freesolve.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FindTheFactor {

    public static void main(String[] args) {
        System.out.println(pthFactor(22876792454961L, 28));
//        System.out.println(pthFactor(500, 4));
    }
    public static long pthFactor(long n, long p) {
        List<Long> factors=new ArrayList<>();
        for(long i=1; i<=Math.sqrt(n); i++){
            if(n%i==0) {
                if (n / i != i) {
                    factors.add(i);
                    factors.add(n/i);
                }
            }
        }

        factors.sort(null);
        if(factors.size()<p){
            return 0L;
        }
        if(p-1>=0){
            return (long) factors.get((int)p-1);
        }
        return 0;
    }

}
