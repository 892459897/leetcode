package leetcode.algorithm;

public class DivingBoard {
    /**
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。
     * 你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
     * 返回的长度需要从小到大排列。
     */
    public static int[] divingBoard(int shorter, int longer, int k) {

        if(k==0){
            return new int[0];
        }else if(shorter==longer){
            int[] a = new int[1];
            a[0] = shorter * k;
            return a;
        }else {
            int[] a = new int[k + 1];
            int j = 0;
            for (int i = shorter * k; i <= longer * k; i = i+(longer-shorter)) {
                a[j] = i;
                j++;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        int shorter=1;
        int longer=2;
        int k=3;
        int[] a = divingBoard(shorter,longer,k);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
