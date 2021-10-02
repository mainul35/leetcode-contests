package bs_coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FibSeq {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String line = br.readLine ();
        int x = Integer.parseInt (line);
        while(x-- > 0){
            String input = br.readLine ();
//            br.readLine ();
            String[] nums = input.trim ().split (" ");
            BigInteger m = new BigInteger (nums[0]);
            BigInteger n = new BigInteger (nums[1]);
            int countOdd = 0;
            int countEven = 1;
            BigInteger swap = BigInteger.ZERO;
            if (m.compareTo (n) == 1 ) {
                swap = m;
                m = n;
                n = swap;
            }
            for(BigInteger i = m; i.compareTo(n)>0; ){
                BigInteger y = fibonacci2(i);
                if(y.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                    countEven++;
                }else{
                    countOdd++;
                }
                i = i.add(BigInteger.ONE);
            }
            System.out.println("Odd = " + countOdd);
            System.out.println("Even = " + countEven);
        }
    }
    public static BigInteger fibonacci2(BigInteger n){
        if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return fibonacci2(n.subtract(BigInteger.TWO)).add(fibonacci2(n.subtract(BigInteger.ONE)));
    }
}
