package 牛客网;

import java.util.List;
import java.util.Stack;

public class NC78 {
    public ListNode ReverseList(ListNode head) {
        //双链表
        /*
        ListNode newList = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = newList;
            newList = head;
            head = temp;
        }
        return newList;

         */


        //栈
        Stack<ListNode> listNodes = new Stack<>();
        while (head!=null){
            listNodes.push(head);
            head = head.next;
        }
        if (listNodes.isEmpty()){
            return null;
        }
        ListNode node = listNodes.pop();
        ListNode newHead = node;
        while (!listNodes.isEmpty()){
            node.next = listNodes.pop();
            node = node.next;
        }
        node.next = null;
        return newHead;

    }


}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
