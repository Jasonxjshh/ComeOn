package Lab;

public class Lab19 {
    public static void findCeilAndFloor(int[] a, int number){
        int begin = 0;
        int end = a.length-1;
        if (number>a[end]){
            System.out.println("Ceil("+number+") = "+(-999)+" and Floor("+number+") = "+a[end]);
        }
        else if (number<a[begin]){
            System.out.println("Ceil("+number+") = "+a[begin]+" and Floor("+number+") = "+(-999));
        }
        else{
            while (begin<=end){
                int middle = (begin+end)/2;
                if (a[middle]==number){
                    System.out.println("Ceil("+number+") = "+a[middle]+" and Floor("+number+") = "+a[middle]);
                    break;
                }
                else if (a[middle]<number){
                    if (a[middle+1]>number){
                        System.out.println("Ceil("+number+") = "+a[middle+1]+" and Floor("+number+") = "+a[middle]);
                        break;
                    }
                    begin = middle + 1;
                }
                else if (a[middle]>number){
                    if (a[middle-1]<number){
                        System.out.println("Ceil("+number+") = "+a[middle]+" and Floor("+number+") = "+a[middle-1]);
                        break;
                    }
                    end = middle - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {-7, -5, -3, -1, 1, 4, 6, 8, 9};
        for (int i=-11; i<12;i++){
            System.out.print("Number "+i+" => ");
            findCeilAndFloor(a,i);
        }
    }
}
