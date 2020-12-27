package MovingWindow;

import MovingWindow.LengthOfLongestSubstring;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringTest {

    @BeforeEach
    void setUp() {
        System.out.println("Start test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End test");
    }

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        int maxLength = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        Assertions.assertEquals(3, maxLength);
    }
}