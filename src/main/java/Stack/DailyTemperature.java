package Stack;

import java.util.Stack;

/**
 * @author Wallace
 * Leetcode 739. Daily Temperatures
 * https://leetcode-cn.com/problems/daily-temperatures/
 */
public class DailyTemperature {
    public static int[] dailyTemperature(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            // if the next temperature is higher than the one in top of stack, we can calculate the number of days for the day on top.
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int preindex = stack.pop();
                // the number of days on top
                res[preindex] = i - preindex;
            }
            stack.push(i);
        }
        return res;
    }
}
