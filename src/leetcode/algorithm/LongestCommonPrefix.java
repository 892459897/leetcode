package leetcode.algorithm;

public class LongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     */

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String result = "";
        for (int i = 0; i < 200; i++) {

            char c = ' ';
            boolean b = false;
            for(String str : strs){
                if(str.length()<=i){
                    b=false;
                    break;
                }
                char s = str.charAt(i);
                if(c==' ') c=s;
                else if(c!=s){
                    b=false;
                    break;
                }
                else b = true;
            }
            if(b) result = result + c;
            else break;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"dog","racecar","car"} ;
        System.out.println(longestCommonPrefix(s));
    }



    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
