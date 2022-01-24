package Lab;

public class Lab8 {
    public int[] shuffle(int[] arr,int[] pos){
        //Initialize a new array to store the value
        int[] result = new int[arr.length];
        for (int i=0;i<pos.length;i++){
            //add the the value to result follow by the pos
            result[i] = arr[pos[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] pos = {3, 2, 4, 1, 0};
        Lab8 a = new Lab8();
        arr = a.shuffle(arr,pos);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
