package leetcode.algorithm;

public class ReverseLeftWords {
	public static String reverseLeftWords(String s, int n) {
		String s1 = s.substring(0, n);
		String s2 = s.substring(n, s.length());
		return s2+s1;
    }
}
