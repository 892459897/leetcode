package leetcode.algorithm;

/*
 * ����ת�ַ���
 * �ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β����
 * �붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ�
 * ���磬�����ַ���"abcdefg"������2���ú�������������ת��λ�õ��Ľ��"cdefgab"��
 */
public class ReverseLeftWords {
	public static String reverseLeftWords(String s, int n) {
		String s1 = s.substring(0, n);
		String s2 = s.substring(n, s.length());
		return s2+s1;
    }
}
