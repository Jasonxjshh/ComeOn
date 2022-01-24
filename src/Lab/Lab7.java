package Lab;

public class Lab7 {
    //This function is to calculate the power of two
    public int power_2(int n){
        //To set the start state
        int result = 1;
        //Each loop will cause the binary code to move n bit to left
        result = result<<n;

        return result;
    }

    public static void main(String[] args) {
        Lab7 a = new Lab7();
        System.out.println(a.power_2(10));
        //Because the for loop will execute n times, the BigO is n
        String BigO = "O(n)";
        System.out.println(BigO);
    }
}
