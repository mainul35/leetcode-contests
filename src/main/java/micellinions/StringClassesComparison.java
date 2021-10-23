package micellinions;

public class StringClassesComparison {
    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer ("");
        StringBuilder stringBuilder = new StringBuilder ("");

        long millis = System.currentTimeMillis ();
        for (int i = 0; i < 10000; i++) {
            s += "something";
        }
        System.out.println ("total execution time 1: " + (System.currentTimeMillis () - millis));

        millis = System.currentTimeMillis ();
        for (int i = 0; i < 10000; i++) {
            s = s.concat ("something");
        }
        System.out.println ("total execution time 2: " + (System.currentTimeMillis () - millis));

        millis = System.currentTimeMillis ();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append ("something");
        }
        System.out.println ("total execution time 3: " + (System.currentTimeMillis () - millis));

        millis = System.currentTimeMillis ();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append ("something");
        }
        System.out.println ("total execution time 4: " + (System.currentTimeMillis () - millis));
    }
}
