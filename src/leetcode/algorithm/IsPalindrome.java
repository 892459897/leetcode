package leetcode.algorithm;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0) {
            return false;
        }
        int length = (int) Math.log10(x) + 1;
        System.out.print("length=" + length + "\n");
        if (length == 2) {
            int high = (x % 100) / 10;
            int low = (x % 10);
            if (high == low) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 1, j = length; i != j & i - j != 1; i++, j--) {
            System.out.print("" + i + "" + "\n");
            int high = (x % ((int) Math.pow(10, j))) / ((int) Math.pow(10, j - 1));
            int low = (x % ((int) Math.pow(10, i))) / ((int) Math.pow(10, i - 1));
            System.out.print("high=" + high + "\n");
            System.out.print("low=" + low + "\n");
            if (high != low) {
                return false;
            }

        }
        return true;
    }
}
