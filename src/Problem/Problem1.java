package Problem;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Problem1 p1 = new Problem1();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(p1.Counter(number));
    }

    public static boolean find_sum9(int x){
        int sum = 0;
        while(x!=0){
            sum = sum + x%10;
            x = x/10;
        }
        if (sum == 9){
            return true;
        }
        else {
            return false;
        }
    }

    public int Counter(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (find_sum9(i)){
                count = count+1;
            }
        }
        return count;
    }
}
