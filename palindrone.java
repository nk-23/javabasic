import java.util.*;
public class palindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k= input.nextInt();
        boolean ans  = ispalindrone(k);
        System.out.println(ans);

    }
    public static boolean  ispalindrone(int num){
        int num1 = reverseno(num);
        if(num1==num){
            return true;
        }
        return false;

    }
    public static int reverseno(int num){
        int  ans =0;
        while(num>0){
            int digit = num%10;
            ans = ans*10+digit;
            num/=10;
        }
        return ans;
    }

}
