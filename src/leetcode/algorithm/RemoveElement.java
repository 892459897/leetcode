package leetcode.algorithm;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        /*
         * 你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
         *
         * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
         *
         * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
         */
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(val != nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i=i+1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums,3));
    }
}
