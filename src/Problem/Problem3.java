package Problem;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Problem3 p3 = new Problem3();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        String num = s.substring(0,length-6);
        float number = Integer.parseInt(num);
        String first = s.substring(length-6,length-4);
        String last = s.substring(length-2);
        double result = p3.transform(first,last,number);
        System.out.println(String.format("%.6f",result));

    }

    public double transform(String first, String last, double number){
        if (first.equals("GB")){
            if (last.equals("MB"))
                number = number*Math.pow(2,10);
            else if (last.equals("KB"))
                number = number*Math.pow(2,20);
            else if (last.equals("B"))
                number = number*Math.pow(2,30);
        }
        else if (first.equals("MB")){
            if (last.equals("GB"))
                number = number*Math.pow(2,-10);
            else if (last.equals("KB"))
                number = number*Math.pow(2,10);
            else if (last.equals("GB"))
                number = number*Math.pow(2,20);
        }
        else if (first.equals("KB")){
            if (last.equals("GB"))
                number = number*Math.pow(2,-20);
            else if (last.equals("MB"))
                number = number*Math.pow(2,-10);
            else if (last.equals("B"))
                number = number*Math.pow(2,10);
        }
        else if (first.equals("B")){
            if (last.equals("GB"))
                number = number*Math.pow(2,-30);
            else if (last.equals("MB"))
                number = number*Math.pow(2,-20);
            else if (last.equals("KB"))
                number = number*Math.pow(2,-10);
        }
        return number;
    }
}
