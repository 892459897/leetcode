package nowcoder.algorithm;

import java.util.Scanner;

/**
 * @Author: A3026
 * @Date: 2021/5/7 9:16
 */
public class StringSplite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            while(str.length()>8){
                System.out.println(str.substring(0,8));
                str = str.substring(8);
            }
            if (str.length() == 8){
                System.out.println(str);
                continue;
            }else{
                String str1 = "";
                for (int i = 0; i < 8-str.length(); i++) {
                    str1 = str1 + "0";
                }
                System.out.println(str+str1);
            }

        }
    }
}
