package Array;

/**
 * @author Wallace
 */
public class FindFirstAndLastPositionInArray {
    /**
     * Search the range of position of target in array
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return new int[]{-1, -1};
        }

        int leftPosition = findLeftPosition(nums, target);
        // no target in array
        if (leftPosition == -1) {
            return new int[]{-1, -1};
        }
        int rightPosition = findRightPosition(nums, target);

        return new int[]{leftPosition,rightPosition};
    }

    /**
     * Find the left position of the target
     * @param nums
     * @param target
     * @return
     */
    private int findLeftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;
            // 小于一定不是解
            if (nums[mid] < target) {
                // 下一轮搜索空间[mid + 1, right]
                left = mid + 1;
            } else if (nums[mid] == target) {
                // 下一轮搜索空间是[left, mid]
                right = mid;
            } else {
                // nums[mid] > target
                // 下一轮搜索空间是[left, mid - 1]
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * Find the right position of the target
     * @param nums
     * @param target
     * @return
     */
    private int findRightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                // 下一轮搜索空间 [left, mid - 1]
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 下一轮搜索空间是[mid, right]
                left = mid;
            } else {
                // nums[mid] < target
                // 下一轮搜索空间是[mid + 1, right]
                left = mid + 1;
            }
        }
        return right;
    }
}
