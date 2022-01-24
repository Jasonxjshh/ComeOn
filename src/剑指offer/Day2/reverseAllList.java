package 剑指offer.Day2;

public class reverseAllList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        return prev;
    }
}
