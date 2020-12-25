package TwoPointers;

import TwoPointers.ThreeSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void threeSum() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(-1,-1,2));
        ans.add(Arrays.asList(-1,0,1));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        System.out.println(result);
        Assertions.assertIterableEquals(ans, result);
    }
}