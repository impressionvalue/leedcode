package ArrayType;

/**
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class StringRerverse {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        str = stringReverse(str);
        System.out.println(str);

    }

    public static char[] stringReverse(char[] str) {


        // 1. 初始化指針
        int i = 0;
        int j = str.length - 1;

        // 2. 交換當前指針
        while (i < j) {
            char thisChar = str[i];
            str[i] = str[j];
            str[j] = thisChar;
            // 指針相向而行
            i++;
            j--;
        }
        return str;
    }
}
