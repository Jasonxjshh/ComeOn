package 杂项;

import java.util.Stack;

public class calculator {
    public static void main(String[] args) {
        String expression = "91-9*1+100";

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        char oper = ' ';
        String temp = "";
        calculator calculator = new calculator();
        int index = 0;
        while (true){
            oper = expression.charAt(index);
            if (calculator.isOper(oper)){
                if (!charStack.empty()){
                    if (calculator.priority(charStack.peek())>=calculator.priority(oper)){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        char ch = charStack.pop();
                        res  = calculator.calculation(num1,num2,ch);
                        numStack.push(res);
                        charStack.push(oper);
                    }
                    else {
                        charStack.push(oper);
                    }
                }
                else {
                    charStack.push(oper);
                }
            }
            else {
                temp = temp+oper;
                if (index == expression.length()-1){
                    numStack.push(Integer.parseInt(temp));
                }
                else if (calculator.isOper(expression.charAt(index+1))){
                    numStack.push(Integer.parseInt(temp));
                    temp = "";
                }
            }
            index++;
            if (index>=expression.length()){
                break;
            }
        }

        while (true){
            if (charStack.empty()){
                break;
            }
            else {
                num1 = numStack.pop();
                num2 = numStack.pop();
                oper = charStack.pop();
                res = calculator.calculation(num1,num2,oper);
                System.out.printf("%d === %d === %s",num1,num2,oper);
                System.out.println();
                numStack.push(res);
            }
        }
        int result = numStack.pop();
        System.out.printf("表达式 %s = %d", expression,result);

    }

    public boolean isOper(char oper){
        if (oper=='+'||oper=='-'||oper=='*'||oper=='/'){
            return true;
        }
        else {
            return false;
        }
    }

    public int priority(char char1){
        if (isOper(char1)){
            if (char1=='*'||char1=='/'){
                return 1;
            }
            else {
                return 0;
            }
        }else {
            return -1;
        }

    }

    public int calculation(int num1, int num2, char oper){
        int result = 0;
        if (oper=='+'){
            result = num1+num2;
        }
        if (oper=='-'){
            result = num2-num1;
        }
        if (oper=='*'){
            result = num1*num2;
        }
        else if (oper=='/'){
            result = num2/num1;
        }
        return result;
    }
}


