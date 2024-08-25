import java.util.*;
public class function {
    public static void main(String[] args) {

         int num=addition(10,45);
        System.out.println(num);

       // printfirstpattern();


    }
    public static int addition(int a,int b){
        System.out.println("good morning");
        Scanner add = new Scanner(System.in);
        //a = add.nextInt();
         //b= add.nextInt();
        int c = a+b;
        return c;


    }
    public static void printfirstpattern(){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int row =1;

        while(row<=k){
            int col=1;
            while(col<=row) {
                System.out.print(" * ");
                col++;
            }
            System.out.println();
            row++;
        }
        input.close();

    }


}
