package String;

/**
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Input
 * ["c","acc","ccc"]
 * Expected ""
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"c","acc","ccc"});
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0]; // flower
        int strIndex = 1;
        while (strIndex < strs.length){
            // 若一直沒有比對到相同的字串, 則不斷縮減字串, 直到比對到相符的 prefix, 再進行下一個字串的比對
            int test = strs[strIndex].indexOf(prefix);
            while (strs[strIndex].indexOf(prefix) != 0) { // 不會在第一個
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            strIndex++;

        }
        return prefix;

//        String firstString = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            String currentString = strs[i];
//            int j = 0;
//            for (; j < firstString.toCharArray().length;j++) {
//                if (j < currentString.length()) {
//                    if (firstString.toCharArray()[j] != currentString.charAt(j)) {
//                        break;
//                    }
//                }
//
//            }
//
//            firstString = firstString.substring(0, j);
//        }
//        return firstString;
    }
}
