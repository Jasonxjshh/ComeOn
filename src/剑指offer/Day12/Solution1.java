package 剑指offer.Day12;

public class Solution1 {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode newList = new ListNode(0);
            ListNode cur = newList;
            while (l1!=null&&l2!=null){
                if (l1.val<=l2.val){
                    cur.next = l1;
                    l1 = l1.next;
                }else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }

            if (l2!=null){
                cur.next = l2;
            }else if (l1!=null){
                cur.next = l1;
            }
            return newList.next;
        }
}

class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int x) {
        val = x;
    }
}
