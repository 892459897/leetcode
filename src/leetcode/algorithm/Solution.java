class Solution {
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
