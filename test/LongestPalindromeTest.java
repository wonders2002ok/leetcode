import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @BeforeEach
    void setUp() {
        System.out.println("Begin test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End test");
    }

    @Test
    void longestPalindrome() {
        String s = "babad";
        String result = LongestPalindrome.longestPalindrome(s);
        System.out.println(result);
    }
}