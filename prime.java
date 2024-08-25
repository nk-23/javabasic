import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the prime no;");
        int k  = input.nextInt();
        int ans = prime1(k);
        System.out.println(ans);


    }

    public static int prime1(int num) {
       // int i=2;
        for( int i=2;i<num;i++)
            if (num % i == 0) {
                //int i1 = i;

                return 0;

            } else {
                return 1;
            }

        return 0;
    }
}
