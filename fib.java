import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibconnaci(num);
       // System.out.println(ans);

    }
    public static void fibconnaci(int num){
        if(num<0)
            return;
            System.out.print("0 ");
        if(num==0) return ;
        System.out.print("1 ");
        int first =0,second =1;
        while(first+second<=num){
        int third = first+second;
            System.out.print(third+" ");
            first= second;
            second = third;
        }
    }
}
