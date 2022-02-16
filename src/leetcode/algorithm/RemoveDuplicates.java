package leetcode.algorithm;


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        /**
         * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
         *
         * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
         *
         */
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i=i+1;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
