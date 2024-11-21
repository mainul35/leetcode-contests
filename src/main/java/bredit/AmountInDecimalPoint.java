package bredit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AmountInDecimalPoint {

    public static void main(String[] args) {
        System.out.println(process(12345, 0));
        System.out.println(process(12345, 2));
        System.out.println(process(12345, 5));
        System.out.println(process(12345, 7));
    }

    /**
     * 12345 / 10
     * */

    public static double process (int amount, int point) {
        var multiplier = 1;
        for (int i = 0; i < point; i++) {
            multiplier *= 10;
        }
        return (double) amount / multiplier;
    }
}
