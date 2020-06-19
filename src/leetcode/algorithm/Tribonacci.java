package leetcode.algorithm;

public class Tribonacci {
    /**
     *泰波那契序列 Tn 定义如下： 
     * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
     * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
     */
    public static int tribonacci(int n) {

        /*
        *递归
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }*/

        //循环
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }
        int f1=0,f2=1,f3=1,f4 = 0;
        for(int i=3;i<=n;i++){
            f4 = f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
        }
        return f4;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
}
