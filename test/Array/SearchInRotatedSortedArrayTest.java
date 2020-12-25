package Array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test starts");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void search() {
        int[] nums = new int[]{4,5,6,7,1,2,3};
        System.out.println(new SearchInRotatedSortedArray().search(nums, 3));
        Assertions.assertEquals(6, new SearchInRotatedSortedArray().search(nums,3));
    }
}