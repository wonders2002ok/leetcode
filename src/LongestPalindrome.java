/**
 * @author Wallace
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int begin = 0, maxlen = 1;
        int len = s.length();
        if (len < 2) {
            return s;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - 1 + 1 > maxlen && validPalindrome(s, i, j)) {
                    maxlen = j - i + 1;
                    // update begin position.
                    begin = i;
                }
            }
        }
        //substring: 第begin位的字符开始截（begin+maxlen）- begin长度的字符串
        return s.substring(begin, begin + maxlen);
    }

    /**
     * Judge if a string is a valid palindrome
     * @param s given string
     * @param left left pointer
     * @param right right pointer
     * @return boolean
     */
    public static boolean validPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
