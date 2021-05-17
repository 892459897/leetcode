package leetcode.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: A3026
 * @Date: 2021/5/11 16:49
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 10000000;
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;

            int sum = nums[i] + nums[start] + nums[end];
            if(target == sum) {
                return sum;
            }

        }
        return 0;
    }
}
