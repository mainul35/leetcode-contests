package bredit;

public class ClockHandDegreeToTime {

    public static void main(String[] args) {
        System.out.println(process(0));
        System.out.println(process(360));
        System.out.println(process(90));
        System.out.println(process(45));
        System.out.println(process(250));
        System.out.println(process(255));
        System.out.println(process(320));
    }

    public static String process (int angle) {
        var hours = angle / 30;
        var minutes = (angle % 30) * 2;
        return String.format((hours < 10? "0%s":"%s")+":"+(minutes < 10 ? "0%s":"%s"),hours,minutes);
    }
}
