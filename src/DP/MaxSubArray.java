package DP;

/**
 * @author Wallace
 */
public class MaxSubArray {
    /**
     * Max sum of sub array
     * @param nums given array
     * @return max sum
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int i : nums) {
            //DP function: sum[i] = max(sum[i - 1] + nums[i], nums[i]);
            pre = Math.max(i, i + pre);
            //if pre > max, udpate max value
            max = Math.max(max,pre);
        }
        return max;
    }
}
