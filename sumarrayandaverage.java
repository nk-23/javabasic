import java.util.Scanner;

public class sumarrayandaverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] arr=new int[k];
        for(int i =0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int ans= add(arr);
        System.out.println(ans);
    }
    public static int  add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
