package HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Two Sum
     * @param nums
     * @param target
     * @retur
     */
    public static int[] twoSum (int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0};
    }
}
