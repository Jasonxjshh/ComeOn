package 剑指offer.Day2;

import java.util.Stack;

public class reversePrint {

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x;
      }
    }
    public int[] reversePrint(ListNode head) {
          ListNode node = head;
         Stack<Integer> stack = new Stack<>();
         int count = 0;
         while (node!=null){
             stack.push(node.val);
             count ++;
             node = node.next;
         }
         int[] ans = new int[count];
         int i = 0;
         while (!stack.isEmpty()){
             ans[i] = stack.pop();
             i++;
         }
         return ans;
    }
}
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
