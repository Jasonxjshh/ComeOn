package 剑指offer.Day11;

public class Solution1 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null&&cur.val!=val){
            pre = cur;
            cur = cur.next;
        }
       if (cur!=null){
           pre.next = cur.next;
       }
       return head;
    }
}
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */