package LeetCode;

import java.util.Arrays;

public class L5954 {
    public static void main(String[] args) {
        L5954 l = new L5954();
        System.out.println(l.minimumRefill(new int[]{1,2,4,4,5}, 6, 5));
    }
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count = 0;
        boolean[] isPlants = new boolean[plants.length];
        int n =plants.length;
        int tempA = capacityA;
        int tempB = capacityB;
        for (int i = 0; i < n; i++) {
            if (i==n/2){
                if (!isPlants[i]){
                    if (tempA>=tempB){
                        if (tempA-plants[i]<0){
                            count++;
                        }
                    }else {
                        if (tempB-plants[i]<0){
                            count++;
                        }
                    }
                }
            }else {
                if (!isPlants[i]){
                    if (tempA-plants[i]<0){
                        count++;
                        System.out.println(i);
                        tempA = capacityA;
                        i--;
                    }else {
                        tempA = tempA-plants[i];
                        isPlants[i] = true;
                    }
                }
                if (!isPlants[n-1-i]){
                    if (tempB-plants[n-1-i]<0){
                        count++;
                        tempB = capacityB;
                        i--;
                    }else {
                        tempB = tempB-plants[n-1-i];
                        isPlants[n-1-i] = true;
                    }
                }
            }


        }
        return count;
    }
}
