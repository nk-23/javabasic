import java.util.Scanner;

public class arrayutiliyt {
    public static int[] inputArray() {
        Scanner  sc= new Scanner(System.in);
       // System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        return num;
   }

}
