package 牛客网;

import java.util.Scanner;

public class NO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] items = new int[n][k];
        for (int i=0;i<n;i++){
            for (int j=0;j<k;j++){
                items[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int temp = items[i][1]+items[j][1];
                boolean flag = true;
                for (int r=1;r<k;r++){
                    if (items[i][r] + items[j][r] != temp) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
