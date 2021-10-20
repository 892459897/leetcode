package leetcode.algorithm;

import java.util.Arrays;

public class MinMoves {
    public int minMoves(int[] nums) {
        /**
         * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
         */

        int min = Arrays.stream(nums).min().getAsInt();
        int result = 0;
        for(int num : nums){
            result = result + (num - min);
        }
        return result;
    }
    
}
