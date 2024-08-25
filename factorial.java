import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the num:");
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        int factorial2 = factorial1( k);
        System.out.println(factorial2);


    }

    public static int factorial1(long  num){
       if(num<2){
           return 1;
       }
       long  fact =1;
       int  i =2;
       while(i<=num){
           fact *= i;
           i++;
       }
       return  (int)fact;


    }

}
