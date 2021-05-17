package nowcoder.algorithm;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: A3026
 * @Date: 2021/5/7 8:40
 */
public class MingRandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            TreeSet treeSet = new TreeSet();
            for (int i = 0; i < num; i++) {
                treeSet.add(sc.nextInt());
            }
            Iterator iterator = treeSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
