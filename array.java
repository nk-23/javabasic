import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 4, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int num = sc.nextInt();
        boolean found = isFound(arr, 12);
        System.out.println(found);


    }
            public static boolean isFound(int[]arr,int num){

            for(int i =0;i<arr.length;i++){
                if(num==arr[i]){
                    return true;
                }


                }

                return false;
            }


        }
