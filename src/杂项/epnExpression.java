package 杂项;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class epnExpression {
    public static void main(String[] args) {

        String expression = "5 + 2 * ( 3 * ( 3 - 1 * 2 + 1 ) )";
        List<String> reverse = reverse(expression);
        System.out.println(reverse);
    }
    public static List<String> reverse(String expression){
        Stack<String> s1 = new Stack<>();//符号栈
        List<String> s2 = new ArrayList<>();//结果栈
        String[] s = expression.split(" ");
        for (int i=0;i<s.length;i++) {
            if (s[i].matches("\\d+")){
                s2.add(s[i]);
            }
            else if (s[i].equals("*") || s[i].equals("/") || s[i].equals("+") || s[i].equals("-")){
                if (s1.empty() || s1.peek().equals("(")){
                    s1.push(s[i]);
                }
                else if (priority(s[i])>=priority(s1.peek())){
                    s1.push(s[i]);
                }
                else {
                    String temp = s1.pop();
                    s2.add(temp);
                    i=i-1;
                }
            }
            else if (s[i].equals("(")){
                s1.push(s[i]);
            }
            else if (s[i].equals(")")){
                while (true){
                    if (s1.peek().equals("(")){
                        s1.pop();
                        break;
                    }
                    else {
                        String temp = s1.pop();
                        s2.add(temp);
                    }
                }
            }
        }
        while (true){
            if (s1.empty()){
                break;
            }
            else {
                String temp = s1.pop();
                s2.add(temp);
            }
        }
        return s2;
    }

    public static int priority(String s1){
        if (s1.equals("*") ||s1.equals("/")){
            return 1;
        }
        else if (s1.equals("+")|| s1.equals("-")){
            return 0;
        }
        else {
            return -1;
        }
    }
}



