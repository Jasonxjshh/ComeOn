package 牛客网;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            long n = scanner.nextLong();
            System.out.println(process(A,n));
        }
    }

    public  static String  process(int A, long n){
        String s = Long.toString(n);
        int mod = s.length()%A;
        StringBuilder result = new StringBuilder();
        for (int i=s.length(); i-A>=0;i=i-A){
            result.insert(0, "_" + s.substring(i - A, i));
        }
        result.insert(0, s.substring(0, mod));
        if (result.toString().startsWith("_")){
            return result.substring(1);
        }
        else {
            return result.toString();
        }
    }
}
