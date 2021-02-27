package Math;

/**
 * @author Wallace
 * Leetcode 9 - Palindrome Number
 * https://leetcode-cn.com/problems/palindrome-number/submissions/
 */
public class IsPalindromeNumber {
    public static boolean isPalindromeNumber(int x) {
        // if x < 0, false
        // 如果x的最后一位是0，且x不为0，则false。原因：数字首位不可能是0。
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        // 因为反转数字要把原始数字不断除以10，所以当原始数字小于等于反转数字时，就意味着已经处理了一半的数字。
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，我们可以通过反转数字/10去除处于中位的数字。因为中位数不影响回文判断结果（永远是回文）。
        // 例如，12321，x = 12, revertedNumber = 123，因为3不影响回文判断结果，所以除10将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
