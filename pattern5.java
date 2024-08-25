import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int i=1;
        while(i<=k){
                int space =0;
                while(space < (k - i)){
                    System.out.print(" ");
                    space++;
                }
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
