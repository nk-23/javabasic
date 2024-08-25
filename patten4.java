import java.util.Scanner;

public class patten4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt() ;
        int i=1;
        while (i <= k) {

            int j =1;
            while(j<=k-i+1){
                int star= k-i+1;
                //System.out.print(star);
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();


    }

}
