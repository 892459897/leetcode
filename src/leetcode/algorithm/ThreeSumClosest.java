package leetcode.algorithm;

import java.util.Arrays;

/**
 *给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 *使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums =  new int[4];
        nums[0] = -1;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = -4;
        System.out.println(threeSumClosest(nums,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 10000000;
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;

            while(end>start){
                int sum = nums[i] + nums[start] + nums[end];
                if(target == sum) {
                    return sum;
                }
                if(sum > target){
                    if(sum-target < Math.abs(best-target)){
                        best = sum;
                    }
                    end = end-1;
                }else if(sum < target){
                    if(target - sum < Math.abs(best-target)){
                        best = sum;
                    }
                    start = start + 1;
                }
            }
        }
        return best;
    }
}
