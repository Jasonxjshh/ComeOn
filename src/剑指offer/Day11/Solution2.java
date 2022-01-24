package 剑指offer.Day11;

public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int size = getSize(head);
        if (head==null){
            return null;
        }
        if (k<=0||k>size){
            return null;
        }
        ListNode pre = head;
        for (int i=0;i<size-k;i++){
            pre = pre.next;
        }
        return pre;
    }

    public int getSize(ListNode head){
        int size = 0;
        ListNode cur =head;
        while (cur!=null){
            size++;
            cur = cur.next;
        }
        return size;
    }
}
