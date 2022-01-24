package LeetCode;

import java.util.*;

public class L786 {
    public static void main(String[] args) {
        L786 l = new L786();
        int[] ints = l.kthSmallestPrimeFraction(new int[]{1,13,17,59}, 6);
        System.out.println(ints[0]+" "+ints[1]);
    }
    PriorityQueue<Number> numbers = new PriorityQueue<>(
            new Comparator<Number>() {
                @Override
                public int compare(Number o1, Number o2) {
                    if (o1.result- o2.result<0){
                        return -1;
                    }

                    else if (o1.result- o2.result==0){
                        return 0;
                    }else {
                        return 1;
                    }
                }
            }
    );
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                numbers.add(new Number(arr[i],arr[j]));
            }
        }
        for (int i = 0; i <k-1; i++) {
            numbers.poll();
        }
        Number poll = numbers.remove();
        return new int[]{
                poll.i,poll.j

        };
    }


}
class Number{
    public int i;
    public int j;
    public double result;
    public Number(int i, int j) {
      this.i = i;
      this.j = j;
      this.result = i*1.0/j;
    }

    @Override
    public String toString() {
        return "Number{" +
                "i=" + i +
                ", j=" + j +
                ", result=" + result +
                '}';
    }
}

//class Solution {
//    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        int n = arr.length;
//        List<int[]> frac = new ArrayList<int[]>();
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                frac.add(new int[]{arr[i], arr[j]});
//            }
//        }
//        Collections.sort(frac, (x, y) -> x[0] * y[1] - y[0] * x[1]);
//        return frac.get(k - 1);
//    }
//}