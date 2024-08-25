import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        //int i=1;
        System.out.println("enter the valur of row:");
        int i = scanner.nextInt();
        System.out.println("enter the value of k:");
        int k = scanner.nextInt();
        //System.out.println("enter the value of k:");
        while(i<=k){
              int j =1;
            while(j<=i){
                System.out.print("*");
                 j++;


            }
            System.out.println();
            i++;


        }
        scanner.close();
    }
}