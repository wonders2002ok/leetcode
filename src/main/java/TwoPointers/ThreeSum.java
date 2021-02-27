package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wallace
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        //empty or length less than 3, then return 0
        if (nums == null || len < 3) {
            return ans;
        }
        for (int i = 0; i < len; i++) {
            // first integer is greater than 0 after sort, there will be no answer, breaks out of for loop
            if (nums[i] > 0) {
                break;
            }
            //Remove duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //remove duplicates from left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    //remove duplicates from right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
