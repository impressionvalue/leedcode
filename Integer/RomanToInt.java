package Integer;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * 解題邏輯:
 *  羅馬字對應的數字是由大到小排序時，是依序相加
 *  可是若發現上一個數字比下一個數字小時，則是相減
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
            // 需要判斷 index 是否有超過長度-1, 避免 out of array index
            if (i + 1 < charArr.length) {
                // 當前羅馬字的數字 > 下一個羅馬字的數字，加上當前數字
                if (getInt(charArr[i]) >= getInt(charArr[i+1])) {
                    result += getInt(charArr[i]);
                } else {
                    // 當前羅馬的數字 < 下一個羅羅馬字的數字，下一個數字減掉當前數字
                    result = result + getInt(charArr[i+1]) - getInt(charArr[i]);
                    i++;
                }
            } else {
                // 因為最後一個數字不用再跟別人比, 所以直接加上最後一個字
                result += getInt(charArr[i]);
            }
        }
        return result;
    }

    /**
     * 取得羅馬字對應的數字
     * @param romanStr
     * @return
     */
    private static int getInt(char romanStr) {
        int result = 0;
        switch(romanStr) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
        }
        return result;
    }
}
