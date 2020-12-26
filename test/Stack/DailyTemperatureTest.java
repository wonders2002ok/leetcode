package Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DailyTemperatureTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test dailyTemperature
     */
    @Test
    void testDailyTemperature() {
        int[] T = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] asserts = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        Assertions.assertArrayEquals(asserts, DailyTemperature.dailyTemperature(T));
    }
}