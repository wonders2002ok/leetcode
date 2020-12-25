package Array;

/**
 * Binary Search for Array. target found return the position in the array
 */
public class BinarySearch {
    public int search (int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = 0;
        while (lo <= hi) {
            mid = lo + ((hi - lo) / 2);
            // 直到相等
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            }
            if (nums[mid] > target) {
                hi = mid -1;
            }
        }
        // Nothing found
        return -1;
    }
}
