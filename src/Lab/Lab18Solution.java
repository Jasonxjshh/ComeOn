package Lab;
//有错误
public class Lab18Solution {
    public static int count(int[] S, int N,int[] A, int j, int res, int k){
        if (N==0) {
            System.out.print("n {");
            for (int i = 0; i <= j; i++) {
                System.out.print(A[i] + " ");
                System.out.print("}");
                res++;
                return res;
            }
        }

            if (N<0){
                j--;
                return res;
            }
            for (int i=k;i<S.length;i++){
                j++;
                A[j]=S[i];
                res = count(S,N-S[i],A,j,res,i);
                j--;
            }
            return res;
        }

    public static void main(String[] args) {
        int[] S = {1,2,3};
        int N = 4;
        int[] A = new int[4];
        int res = 0;
        int k = 0;
        int j = -1;
        System.out.println("n Total number of way to get desired change is"+count(S,N,A,j,res,k));
    }
}



