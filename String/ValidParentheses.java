package String;

import sun.plugin2.message.PrintAppletReplyMessage;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        boolean test = isValid("((");
        System.out.println(test);
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        // 將成對的資料放在一起, 將利用 map 進行成對元素的檢查
        map.put('(', ')'); // ()
        map.put('[', ']'); // []
        map.put('{', '}'); // {}

        Stack<Character> stack = new Stack<>();
        /**
         * 在檢查有沒有成對的資料時,
         * 右括號有對應的左括號時(從stack pop出來比對),
         * 最後 stack 中沒有任何元素時, 表示檢查成功
         */
        char[] charArr = s.toCharArray();
        for (Character item : charArr) {
            if (map.containsKey(item)) {
                stack.push(item);
            } // 不是左邊括號的時候
            else {
                // 此時的右括號沒有左括號可以比對
                if (stack.isEmpty()) {
                    return false;
                }
                // 將左括號取出, 並比較字串中是否有對應的右括號元素
                if (!map.get(stack.peek()).equals(item)) {
                    return false;
                }
                // 確定有成對元素後將元素成 stack pop
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
