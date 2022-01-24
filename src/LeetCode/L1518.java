package LeetCode;

public class L1518 {
    public static void main(String[] args) {
        L1518 l = new L1518();
        int i = l.numWaterBottles(15, 4);
        System.out.println(i);
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles>=numExchange){
            int x = numBottles/numExchange;
            int y = numBottles%numExchange;
            result += x;
            numBottles = x+y;
        }
        return result;
    }
}
