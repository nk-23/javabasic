import java.util.*;
public class astromong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        boolean ans =  isArmstrong(k);
        System.out.println(ans);

    }
    public static boolean isArmstrong(int num){
        int k = num;
        int digits = noofdigit(num);
        int finalnumber =0;
        while (num > 0) {
            int lastdigit = num%10;
            num /=10;
            finalnumber +=pow(lastdigit,digits);
        }
        if(finalnumber==k){
            return true;
        }
        return false;

    }
    public static int pow(int num1,int num2){
        int result =1;
        int i =0;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noofdigit(int num){
        int digit=0;
        while(num>0){
            digit++;
            num/=10;
        }
        return digit;
    }


}
