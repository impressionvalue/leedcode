package Integer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    // 暴力解: 時間複雜度 O(n^2)
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = null;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result = new int[]{i, j};
//                    break;
//                }
//            }
//        }
//        return result;
//    }
    // [3,2,4]
    // 時間複雜度只要O(N)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        HashMap<Integer, Integer> map = new HashMap<>(); // 數字,索引
        for (int i = 0; i < nums.length; i++) {
            int substractNum = target - nums[i];
            // 檢查目標數字減掉當前數字的差, 是否存在, 如果存在取出該數字的索引以及當前數字的索引
            if (map.containsKey(substractNum)) {
                return new int[]{map.get(substractNum), i};
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
