package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

class IsValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     */


    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')'); put('?','?');
    }};

    public static boolean isValid(String s) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int length = str.length();
            if(length!=0 && map.get(str.charAt(length-1))!=null && map.get(str.charAt(length-1)) == c){
                str.deleteCharAt(length-1);
            }else{
                str.append(c);
            }
        }
        if(str.length()==0){
            return true;
        }else{
            return false;
        }
    }
}
