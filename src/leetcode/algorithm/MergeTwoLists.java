package leetcode.algorithm;

public class MergeTwoLists {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     */


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

         ListNode prehead = new ListNode(-1);
         ListNode result = prehead;
         while (l1!=null && l2!=null){
             if (l1.val <= l2.val){
                 result.next = l1;
                 l1 = l1.next;
             }else{
                 result.next = l2;
                 l2 = l2.next;
             }
             result = result.next;
         }
        result.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
