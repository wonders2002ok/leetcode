package Stack;

import Stack.ValidParentheses;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void isValid() {
        String s = "(){]{}[]";
        System.out.println(ValidParentheses.isValid(s));
    }
}