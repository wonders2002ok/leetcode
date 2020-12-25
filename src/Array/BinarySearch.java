package Array;

/**
 * Binary Search for Array. target found return the position in the array
 */
public class BinarySearch {
    public int search (int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + ((end - start) / 2);
            // 直到相等
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                end = mid -1;
            }
        }
        // Nothing found
        return -1;
    }
}
