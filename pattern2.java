import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int i = 1;
        while(i<=k){
            int j =1;

            while(j<=k){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();
    }

}
