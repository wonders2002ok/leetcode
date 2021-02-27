package Math;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsPalindromeNumberTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    /**
     * Test isPalindromeInteger method
     */
    @Test
    void testIsPalindromeInteger() {
        int x = 12321;
        Assertions.assertEquals(true, IsPalindromeNumber.isPalindromeNumber(x));
        int y = 123;
        Assertions.assertEquals(false, IsPalindromeNumber.isPalindromeNumber(y));
    }
}