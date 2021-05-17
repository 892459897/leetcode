package leetcode.algorithm;

public class LengthOfLongestSubstring {
	public static int checkRepeat(String s,int i,int j,String c){
		for(int k=i;k<j;k++){
			if(c.equals(s.substring(k, k+1))){
				return k;
			}
		}
		return -1;
	}
	public static int lengthOfLongestSubstring2(String s) {
		if(s.equals("")){
			return 0;
		}
		int i=0,j=1,length=s.length();
		int large=1,temp=1;
		while(i<length-1 & j<length){
			System.out.print("i="+i+"\n");
			System.out.print("j="+j+"\n");
			int check=checkRepeat(s,i,j,s.substring(j, j+1));
			System.out.print("check="+check+"\n");
			if(check!=-1){
				i=check+1;
			}else{
				temp = j-i+1;
				System.out.print("temp="+temp+"\n");
				if(temp>large){
					large=temp;
					System.out.print("large="+large+"\n");
				}
				j=j+1;
			}
		}
		return large;
	}
	public static int lengthOfLongestSubstring1(String s) {
		if(s.equals("")){
			return 0;
		}
		int large=1;
		int templarge=1;
		for(int i=0,length=s.length();i<length-1;i++){
			System.out.print("外层循环第"+i+"次"+"\n");
			templarge=1;
			for(int j=i+1;j<length;j++){
				System.out.print("------内层循环"+j+"\n");
				int flag=0;
				for(int k=i;k<j;k++){
					System.out.print("------------比较"+s.substring(k, k+1)+"和"+s.substring(j, j+1)+"\n");
					if(s.substring(k, k+1).equals(s.substring(j, j+1))){
						flag=1;
					}
				}
				if(flag==0){
					templarge=templarge+1;
				}else{
					break;
				}
			}
			System.out.print("templarge="+templarge+"\n");
			if(templarge>large){
				large=templarge;
			}
		}
		return large;

	}
}
