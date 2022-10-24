package Integer;

/**
 * 	7*1=7
 * 	7*9=63
 * 	7*2=14
 * 	7*8=56
 * 	7*3=21
 * 	7*7=49
 * 	7*4=28
 * 	7*6=42
 * 	7*5=35
 */
public class Multiple7 {
    public static void main(String[] args) {
        int len = 9;
        final int MULTI = 7;
        int multi = 1;

        for (int i = 1; i < len ; i++) {
            System.out.println(String.format("7*%s=%s", multi, MULTI * multi));
            // 被乘數比中位數還小的值, 找出該補數, 於下一輪印出
            if (multi < len/2) {
                multi = len - multi;
            } else {
                multi = len - multi + 1;
            }
        }

//        for (int i = 1; i <= len / 2 ; i++) {
//            if (i == len / 2) {
//                System.out.println(String.format("7*%s=%s", i, MULTI * i));
//            } else {
//                System.out.println(String.format("7*%s=%s", i, MULTI * i));
//                System.out.println(String.format("7*%s=%s", len - i, MULTI * (len - i)));
//            }
//        }
    }

}
