package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm {
	
	/*
	 * 将数字变成 0 的操作次数
	 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
	 */
	public static int numberOfSteps (int num) {
		if(num==0) {
			return 0;
		}else {
			int i = 0;
			while(num!=0) {
				if(num%2==0) {
					num = num/2;
					i=i+1;
				}else {
					num = num-1;
					i = i+1;
				}
			}
			return i;
		}
    }
	
	/*
	 * 有多少小于当前数字的数字
	 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
	 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
	 * 以数组形式返回答案。
	 */
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int n = nums.length;
		int[] temp = new int[n];
		temp = Arrays.copyOf(nums, n);
		Arrays.sort(temp);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(i==0) {
				map.put(temp[i], 0);
			}else {
				if(temp[i]>temp[i-1]) {
					map.put(temp[i], i);
				}else {
					map.put(temp[i],map.get(temp[i-1]));
				}
			}
		}
		for(int i=0;i<n;i++) {
			temp[i] = map.get(nums[i]);
		}
		return temp;
    }
	
	/*
	 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
	 * 字符          		数值
	 * I             1
	 * V             5
	 * X             10
	 * L             50
	 * C             100
	 * D             500
	 * M             1000
	 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
	 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
	 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
	 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
	 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
	 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
	 */
	public static int romanToInt(String s) {
		int sum = 0;
        int preNum = getValue(s.charAt(0));
        
		return 0;
		
		
    }
	private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
	}
	
	/*
	 * 一年一度的春招就要到来了，牛牛为了备战春招，在家刷了很多道题，
	 * 所以牛牛非常喜欢AC这两个字母。他现在有一个只包含A和C的字符串，
	 * 你可以任意修改最多k个字符，让A变成C，或者C变成A。请问修改完之后，最长连续相同字符的长度是多少。
	 */
	public static int calLength(int k,String s,char c) {
		int l=0,r=0,max=0,length=s.length();
		while(r<length && l<length) {
			while(r<length && l-r<k) {
				
			}
		}
		return 0;
	}
}
