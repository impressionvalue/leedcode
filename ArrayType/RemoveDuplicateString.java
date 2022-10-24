package ArrayType;

/**
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscor
 */

public class RemoveDuplicateString {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] result = removeDuplicateString(nums);
        System.out.println(result.length);
    }

    public static int[] removeDuplicateString(int[] nums) {
        // 1. 初始化指針 (同方向指針)
        int i = 0;
        int j = 0;

        // 2. 取得兩指針指到的不同數字
        while(j < nums.length ) {
            if (i == 0 || nums[j] != nums[i-1]) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        return nums;
    }
}
