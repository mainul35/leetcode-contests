package leetcode.challange_2021.weekly_251;

public class LargestNumberAfterMutatingSubstring {
    public static void main(String[] args) {

//        String num = "132";
//        int[] change = new int[]{9,8,5,0,3,6,4,2,6,8};

//        String num = "021";
//        int[] change = new int[]{9,4,3,5,7,2,1,9,0,6};

        String num = "334111";
        int[] change = new int[]{0,9,2,3,3,2,5,5,5,5};

//        String num = "330";
//        int[] change = new int[]{9,3,6,3,7,3,1,4,5,8};

        String maxNum = __maximumNumber(num, change);
        System.out.println(maxNum);

    }

    public static String __maximumNumber(String num, int[] change) {
        char s[] = num.toCharArray();
        boolean flag = false;
        for(int i=0; i<s.length; i++) {
            char ch = s[i];
            int curr = ch -'0';
            if(change[curr] > curr) {
                s[i] = (char)(change[curr] + '0');
                flag = true;
            }
            else if(change[curr] != curr) {
                if(flag) break;
            }
        }

        return new String(s);
    }


    public static String maximumNumber(String num, int[] change) {
        String newNum = num;
        for (int i = 0; i < newNum.length(); i++) {
            String changedNum = newNum.replace(newNum.charAt(i), (""+change[Integer.parseInt(""+newNum.charAt(i))]).charAt(0));
            if (Integer.parseInt(newNum) <= Integer.parseInt(changedNum)) {
                newNum = changedNum;
            } else {
                break;
            }
        }
        return newNum;
    }
}
