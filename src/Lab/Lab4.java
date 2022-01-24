package Lab;

public class Lab4 {
    public static void main(String[] args) {
        Lab4 l = new Lab4();
        int[] myarray = { 3, 2,  9, -2, 3, 2};
        int specify_num = 8;
        l.Find(myarray, specify_num);
    }

    public void Find(int[] myarray, int specify_num){
        boolean find = false;
        for (int i=myarray.length;i>0;i--){
            if (!find){
                int[] result = new int[i];
                for (int j=0;j<myarray.length-i;j++){
                    for (int k=0;k<result.length;k++){
                        result[k] = myarray[j+k];
                    }
                    int sum = 0;
                    for (int x=0;x<result.length;x++){
                        sum = sum+result[x];
                    }
                    if (sum==specify_num){
                        find = true;
                        String st = "";
                        for (int y=0;y<result.length;y++){
                            st = st+result[y]+" ";
                        }
                        System.out.println("The sum of this subarray { "+st+"} is "+specify_num+"and its length is "+i);
                    }

                }
            }
            else{
                break;
            }
        }
        if (!find){
            System.out.println("No answer!!!");
        }
    }
}