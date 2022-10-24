package Integer;

import java.util.Stack;

/**
 * 給定一個整數 x，如果 x 是回文整數，則返回 true。
 *
 * 當一個整數向後讀和向前讀一樣時，它就是一個回文數。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * Input: x = 121
 * Output: true
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        boolean result = isPalindrome(0);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        System.out.println(arr);
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> tmpStack = new Stack<Character>();
        Stack<Character> newStack = new Stack<Character>();
        for (char element: arr) {
            stack.push(element);
            newStack.push(element);
        }

        while (!newStack.empty()) {
            tmpStack.push(newStack.pop());
        }
        System.out.println("stack" + stack);
        System.out.println("newStack" + newStack);
        System.out.println("tmpStack" + tmpStack);

        boolean isSame = isSameStack(stack, tmpStack);


        return isSame;
    }

    public static boolean isSameStack(Stack<Character> stack1, Stack<Character> stack2) {
        boolean flag = true;
        if (stack1.size() != stack2.size()) {
            return false;
        }

        while(!stack1.empty()) {
            if (stack1.peek().equals(stack2.peek())) { // 最上面如果相同
                stack1.pop();
                stack2.pop();
            } else { // 不相同
                flag = false;
                break;
            }
        }

        return flag;

    }
}
