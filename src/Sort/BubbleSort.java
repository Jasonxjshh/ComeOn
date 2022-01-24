package Sort;

import java.util.Arrays;

public class BubbleSort {

        public static void main(String[] args) {
            int[] arr1 = new int[] {5, 7, 4, 3, 7, 3, 9, 1, 0};
            bubbleSort(arr1);
            System.out.println(Arrays.toString(arr1));
        }
        public static void bubbleSort(int[] arr) {
            for(int i = 0; i < arr.length-1; i++) {
                for(int j = 0; j < arr.length - 1 - i; j++) {
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
}
