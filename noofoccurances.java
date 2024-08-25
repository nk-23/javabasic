import java.util.Scanner;

public class noofoccurances {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] numArray = arrayutiliyt.inputArray();
        int  number= sc.nextInt();
        int ans=  noofoccurance(numArray,number);
        System.out.println(ans);
        sc.close();
    }
    public static int noofoccurance(int[]num,int number){
        int count =0;
        for(int i=0;i<num.length;i++){
            if(num[i]==number);
            count++;
        }
        return count;
    }
}
