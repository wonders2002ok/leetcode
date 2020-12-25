package Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
    void testValid() {
        String s = "(){}[]";
        System.out.println(ValidParentheses.isValid(s));
        Assertions.assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    void testNonValid() {
        String s = "{}(){]";
        System.out.println(ValidParentheses.isValid(s));
        Assertions.assertEquals(false, ValidParentheses.isValid(s));
    }
}