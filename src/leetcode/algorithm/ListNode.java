package leetcode.algorithm;

public class ListNode {
	 int val;
     ListNode next;
     ListNode(int x) { val = x; }
     
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode l3=new ListNode(0);
         ListNode list=l3;
         int temp=0;
         while(l1!=null || l2!=null){
         	if(!(l1!=null)){
         		list.next=new ListNode((l2.val+temp)%10);
         		if(l2.val+temp>=10){
         			temp=1;
         		}else{
         			temp=0;
         		}
         		l2=l2.next;
         	}else if (!(l2!=null)){
         		list.next=new ListNode((l1.val+temp)%10);
         		if(l1.val+temp>=10){
         			temp=1;
         		}else{
         			temp=0;
         		}
         		l1=l1.next;
         	}else{
         		list.next=new ListNode((l1.val+l2.val+temp)%10);
         		if(l1.val+l2.val+temp>=10){
         			temp=1;
         		}else{
         			temp=0;
         		}
         		l1=l1.next;
         		l2=l2.next;
         	}
         	list=list.next;
         }
         if(temp==1){
         	list.next=new ListNode(1);
         }
         
         return l3.next;
     }
 	public static void resultOut(ListNode l1) {
 		while(l1!=null){
 			System.out.print(l1.val+" ");
 			l1=l1.next;
 		}
 		System.out.print(""+"\n");
 	}
}
