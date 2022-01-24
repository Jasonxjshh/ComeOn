package 牛客网;


import java.util.Scanner;

/*
*
* 众所周知水在低于 0 摄氏度的时候是固态，在高于 0 摄氏度的时候是液态，在等于 0 摄氏度的时候是可能是液态也可能是固态还可能是固液混合

现在有个加热工具，加热 c 秒可以使冰升温 1 摄氏度。

加热 d 秒可以使 0 摄氏度的冰变成 0 摄氏度的水。

加热 e 秒可以使水升温 1 摄氏度。

现在给出两个温度 a , b ，请计算用这个加热工具将水从 a 摄氏度加热到 b 摄氏度所需要的时间。
保证a不为零。
*
*
*
* */
public class NO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        if (A<0){
            System.out.println(C*(-A) + D + E*B);
        }else {
            System.out.println(E*(B-A));
        }

    }
}
