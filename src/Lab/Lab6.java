package Lab;

public class Lab6 {
    //This is the function to calculate the power
    public int power_1(int m, int n){
        //To set the start state
        int result = 1;
        //Each loop will multiply by m
        //If n=0,the for loop will be shipped
        for (int i=1;i<=n;i++){
            result = result*m;
        }
        return result;
    }

    public static void main(String[] args) {
        Lab6 a = new Lab6();
        System.out.println(a.power_1(2,10));
        //Because the for loop will execute n times, the BigO is n
        String BigO = "O(n)";
        System.out.println(BigO);
    }
}
