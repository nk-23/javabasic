import java.sql.SQLOutput;
import java.util.*;
public class patten1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of k:");
        int k = input.nextInt();
        System.out.println("enter the value of row:");
        int i = input.nextInt();
        while(i<=k){
            //System.out.println("enter the value of j:");
            int j = 1;
            while(j<=k){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }
        input.close();

    }
}
