package 杂项;//寻找质数

public class FindPrimeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean[] myArray = new boolean[100];
        for(int i = 2; i < 100; i++) {
            myArray[i] = true;
        }
        for(int i = 2; i < 100; i++) {
            if(myArray[i] == true) {
                for (int j = 2*i; j < 100 ;j = i + j){
                    myArray[j] = false;
                }
            }
        }

        for (int i=0;i<myArray.length;i++){
            if(myArray[i]==true){
                System.out.println(i);
            }
        }
        long x = System.currentTimeMillis()-start;
        System.out.println(x);
    }
}


