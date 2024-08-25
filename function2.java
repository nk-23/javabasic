import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("welcome to mutiplication table");
       int num = scanner.nextInt();
        //muplicationtable(num);
        int oddsum= sumofallodd(num);
        System.out.println(oddsum);
    }
    public static int  sumofallodd(int num){
       int sum=0;
             for (int i=1;i<=num;i+=2){
                 sum += num;
             }
        return sum;
    }
    public static void muplicationtable(int num){
        int i =1;
        while(i<=10){
            System.out.println((num*i));
            i++;
        }
    }

}
