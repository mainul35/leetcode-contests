package leetcode.challange_2021.weekly_248;

public class EliminateMaximumNumberOfMonsters {
    public static void main(String[] args) {
//        int dist[] = new int[]{1,3,4};
//        int speed[] = new int[]{1,1,1};

//        int dist[] = new int[]{1,1,2,3};
//        int speed[] = new int[]{1,1,1,1};

//        int dist[] = new int[]{4,2,3};
//        int speed[] = new int[]{2,1,1};

//        int dist[] = new int[]{3,2,4};
//        int speed[] = new int[]{5,3,2};

        int dist[] = new int[]{4,2,8};
        int speed[] = new int[]{2,1,4};

        int total = eliminateMaximum(dist, speed);

        System.out.println(total);
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        int big = 0;
        int total = 0;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] > big) {
                big = dist[i];
            }
            total++;
            if (i+1 < dist.length &&  big >= dist[i + 1]) {
                for (int j = 0; j < dist.length; j++) {
                    if (dist[j] - speed[j] <= 0) {
                        return total;
                    }
                }
            }
        }
        return total;
    }

}
