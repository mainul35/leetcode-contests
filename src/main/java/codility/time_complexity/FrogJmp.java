package codility.time_complexity;

public class FrogJmp {
    public static void main(String[] args) {
        int  X = 10;
        int Y = 85;
        int D = 30;
        System.out.println (solution (X, Y, D));
    }

    public static int solution(int X, int Y, int D) {
       return  (Y-X)%D > 0 ? ((Y-X) / D) + 1  : ((Y-X) / D);
    }
}
