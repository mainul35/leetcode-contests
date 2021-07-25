package july.leetcode.challange_2021.weekly_251;

public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;

        int lucky = getLucky(s, k);
        System.out.println(lucky);
    }

    public static int getLucky(String s, int k) {
        String keyVals = "";
        for (int i = 0; i < s.length(); i++) {
            keyVals += (s.charAt(i) - 96);
        }

        int lucky = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < keyVals.length(); j++) {
                sum += Integer.parseInt(""+keyVals.charAt(j));
            }
            keyVals = ""+sum;
            lucky = sum;
        }
        return lucky;
    }
}
