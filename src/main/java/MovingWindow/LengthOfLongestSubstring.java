package MovingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wallace
 */
public class LengthOfLongestSubstring {
    /**
     * Length of the longest substring, using Moving Window algorithm
     * @param s given string
     * @return length of the longest substring
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        //left pointer
        int start = 0, max = 0;
        //Hashmap used for recognizing if character is visited
        Map<Character,Integer> map = new HashMap<>(0);
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                //update left boundary
                start = Math.max(map.get(cur), start);
            }
            max = Math.max(max, i - start + 1);
            map.put(s.charAt(i), i + 1);
        }
        return max;
    }
}
