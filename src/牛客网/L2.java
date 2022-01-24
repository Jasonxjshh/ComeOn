package 牛客网;

public class L2 {

    public static void main(String[] args) {
        int n =12345;
    }

//    private static int so(int n){
//         char[] chars = Integer.toString(n).toCharArray();
//    }
    private static boolean isPrime(int i){
        if (i==1){
            return false;
        }
        boolean flag=true;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
