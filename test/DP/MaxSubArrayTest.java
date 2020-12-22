package DP;

import DP.MaxSubArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxSubArrayTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void maxSubArray() {
        int[] nums = new int[]{-2,1,-3,4,-2,2,7,-1,4};
        System.out.println(MaxSubArray.maxSubArray(nums));
    }
}