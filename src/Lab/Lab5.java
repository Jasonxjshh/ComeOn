package Lab;

public class Lab5 {
    public static void main(String[] args) {
        Lab5 lab5 =new Lab5();
        int[] myarray =  { 5, 3, 5, 6, 7, 7, 9, 3, 2 };
        int specify_num = 5;
        lab5.remove(myarray, specify_num);
    }
    public void remove(int[] myarray, int pecify_num){
        int[] result = new int[myarray.length];
        int indexstart = 0;
        int indexend = myarray.length-1;
        for (int i=0;i<myarray.length;i++){
            if (myarray[i]==pecify_num){
                result[indexend] = 5;
                indexend = indexend - 1;
            }
            else {
                result[indexstart] = myarray[i];
                indexstart = indexstart + 1;
            }
        }
        for(int x:result){
            System.out.print(x+" ");
        }
    }
}
