  import java.util.*;
class hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans= hcf2(num1,num2);
        System.out.println(ans);


    }
    public static int hcf2(int num1,int num2){
        int gcd =1;
        int i =2;
        int least= least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i ==0){
                gcd=i;
            }
            i++;
        }

        return gcd;


    }
    public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        else{
           return num2;
        }
        //return 0;

    }

}
