package nowcoder.algorithm;

import java.util.Scanner;

/**
 * @Author: A3026
 * @Date: 2021/5/7 8:10
 */
public class LastStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        System.out.println(strs[strs.length-1].length());
    }
}
