import java.util.Scanner;

public class findmaxandmin {
    private static final int INT_MAX = 100000000;
    private static final int INT_MIN =-100000000;


    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int k = sc.nextInt();
        int[] num = new int[k];
        for(int  i= 0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        int min1 = min(num);
        int max1 =max(num);
        System.out.println(min1);
        System.out.println(max1);
    }
    public static int min(int[]num){
        int min=INT_MAX;
        for(int i =0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }

        return min;
    }
    public static int max(int[]num){

        int max= INT_MIN;
        for(int i =0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }

        return max;
    }
}
