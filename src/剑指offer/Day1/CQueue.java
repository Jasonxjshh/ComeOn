package 剑指offer.Day1;

import java.util.LinkedList;
import java.util.Queue;

/*
* 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数
* appendTail 和 deleteHead ，分别完成在队列尾部插入整数
* 和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
* */
public class CQueue {
    Queue<Integer> stack1;
    Queue<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.offer(stack1.poll());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            return stack2.poll();
        }
    }
}
/*
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */