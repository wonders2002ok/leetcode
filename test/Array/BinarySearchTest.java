package Array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test starts");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void testSearchWithTarget() {
        int[] nums = new int[]{1,4,5,7,8,9};
        System.out.println(new BinarySearch().search(nums, 9));
        Assertions.assertEquals(5, new BinarySearch().search(nums, 9));
    }

    @Test
    void testSearchWithoutTarget() {
        int[] nums = new int[]{1,3,5,7,9};
        System.out.println(new BinarySearch().search(nums, 0));
        Assertions.assertEquals(-1, new BinarySearch().search(nums, 0));
    }
}