package HashTable;

import HashTable.TwoSum;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
     void testTwoSum() {
        int[] test = new int[]{1,2,5,4,9};
        int[] result;
        int target = 10;
        result = TwoSum.twoSum(test, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Test
    void testTwoSumEmpty() {
        int[] test = new int[]{1,3,5,7};
        int[] result;
        int target = 20;
        result = TwoSum.twoSum(test, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}