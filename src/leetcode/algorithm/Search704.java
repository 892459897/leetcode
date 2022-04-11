package leetcode.algorithm;

import java.util.Arrays;

public class Search704 {
    /**
     * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
     */

    public static int search(int[] nums, int target) {
        int max = nums.length - 1;
        int min = 0;
        int i = max / 2 ;
        while (i>=0 && i <= max){
            if(nums[i]==target){
                return i;
            }else if(nums[i] < target){
                min = i+1;
                i = min + ((max-min)/2);
            }else if(nums[i] > target){
                max = i - 1;
                i = min + ((max-min)/2);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        int target = -1;
        System.out.println(search(nums,target));
    }
}
