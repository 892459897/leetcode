package leetcode.algorithm;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 */
public class Reverse {
	public static int reverse(int x) {
		int temp = 0;
		while (x!=0){
			int a = x%10;

			//判断是否 大于 最大32位整数
			if (temp>214748364 || (temp==214748364 && a>7)) {
				return 0;
			}
			//判断是否 小于 最小32位整数
			if (temp<-214748364 || (temp==-214748364 && a<-8)) {
				return 0;
			}
			temp = temp*10 + a;
			x /= 10;
		}
		return temp;
    }

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
