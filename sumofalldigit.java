import java.util.Scanner;

public class sumofalldigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int k = input.nextInt();
        int ans =  digitsum(k);
        System.out.println(ans);



    }
    public static int  digitsum(int num){
        int sum =0;
        while(num!=0) {
            int digit = num % 10;
            sum+=digit;
            num /= 10;

        }
        return sum;

    }
}
