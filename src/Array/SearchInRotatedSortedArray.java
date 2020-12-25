package Array;

/**
 * @author Wallace
 * LeetCode 33. Search in Rotated Sorted Array
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * 思路：
 * 1. 前半部分有序：nums[start] <= nums[mid]
 *    target如果在start和mid之间，则在前半部分搜索，end = mid - 1
 *    反之，则start = mid + 1;
 * 2. 后半部分有序：nums[start] > nums[mid]
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 前半部分有序
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[end] >= target && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
