package 牛客网;


import java.util.Scanner;

/*
* 科学家正在计划利用  行星上的一个研究模块进行一项重要的测量实验，测量共分为两次进行。

因为宇宙中有多种不确定因素，科学家们已经确定了最佳测量的时间在 l 到 r 范围内。

测量的要求是两次测量的间隔时间必须是 a 的倍数，现在请你帮助科学家计算测量方式的数量。

即有多少对测量时间 i 和 j 满足 l <= i < j <= r ，并且 j-i 是 a 的倍数。
* */
public class NO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();

        int count = 0;
        for (int n = 1; n *a<=r-l; n++){
            for (int i = l; i <=r; i++){
                if (i+n*a<=r){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
