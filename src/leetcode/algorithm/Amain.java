package leetcode.algorithm;

import leetcode.algorithm.ListNode;
import leetcode.algorithm.IsPalindrome;
import leetcode.algorithm.LengthOfLongestSubstring;
import leetcode.algorithm.ReverseLeftWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Amain {
	public static void main(String[] args) {
		Integer a = 200;
		Integer b = 200;
		int c = 200;
		int d = 200;
		System.out.print(a.equals(b));
	}
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String s1 = scanner.nextLine();
//		String s2 = scanner.nextLine();
//		s1 = s1.replace(" ", "").replace("\t", "");
//		int count = 0;
//		for(int i=0,j=s2.length();j<=s1.length();i++,j++) {
//			if(s1.substring(i, j).equals(s2)) {
//				count = count +1;
//			}
//		}
//		System.out.println(count);
//	}
	
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String s = scanner.nextLine();
//		String[] l = s.split("@");
//		if(!(l.length == 1)) {
//			String s1 = l[0];
//			String s2 = l[1];
//			ArrayList list = new ArrayList();
//			l = s1.split(",");
//			HashMap<String,Integer> m1 = new HashMap<>();
//			for(int i=0;i<l.length;i++) {
//				m1.put(l[i].split(":")[0],Integer.valueOf(l[i].split(":")[1]));
//				list.add(l[i].split(":")[0]);
//			}
//			
//			l = s2.split(",");
//			for(int i=0;i<l.length;i++) {
//				m1.put(l[i].split(":")[0],m1.get(l[i].split(":")[0])-Integer.valueOf(l[i].split(":")[1]));
//			}
//			
//			String result = "";
//			for(int i=0;i<list.size();i++) {
//				if(m1.get(list.get(i)) != 0) {
//					result = result + list.get(i) + ":" + m1.get(list.get(i)) + ",";
//				}			
//			}
//			if(!"".equals(result)) {
//				result = result.substring(0,result.length()-1);
//			}
//			System.out.println(result);
//		}else{
//			System.out.println(s.substring(0,s.length()-1));
//		}
//		
//	}
	
	
	
	
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNext()){
//	        StringBuilder stringBuilder = new StringBuilder();
//	        String str = scanner.nextLine();
//	        stringBuilder.append(str);
//	        int size = stringBuilder.length();
//	        int addZero = 8 - size%8;
//	        if(addZero > 0 && addZero < 8){
//	            while(addZero > 0){
//	                stringBuilder.append('0');
//	                addZero--;
//	            }
//	        }
//	        String  str1 = stringBuilder.toString();
//	        while(str1.length()>0){
//	            System.out.println(str1.substring(0, 8));
//	            str1 = str1.substring(8);
//	        }
//		 }    
//	}
	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0, x;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                x = sc.nextInt();
//                ans += x;
//            }
//        } 
//        System.out.println(ans);
//    }
	
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String a = in.nextLine();
//            int count = 0;
//          
//            for(int i = 0;i<a.length();i++) {
//            	if(Character.isUpperCase(a.charAt(i))) {
//            		count = count +1;
//            	}
//            }
//            System.out.println(count);
//        }
//    }
	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0, x;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                x = sc.nextInt();
//                ans += x;
//            }
//        } 
//        System.out.println(ans);
//    }
	
	
}
