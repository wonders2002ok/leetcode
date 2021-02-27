package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Wallace
 * 遇左进栈，遇右判断栈顶元素，如果成对，继续直到栈弹空
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>(0);
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)){
                //if stack is empty or the first element of stack does not equals to current character, then string is not valid
                if (stack.isEmpty() || !stack.peek().equals(map.get(cur))) {
                    return false;
                }
                stack.pop();
            } else {
                //continue push into stack
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}
