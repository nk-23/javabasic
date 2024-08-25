import java.util.Scanner;

 class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k1= input.nextInt();
        int k2=  input.nextInt();
        int ans= lcmfind(k1,k2);
        System.out.println(ans);

    }
    public static int lcmfind(int num1,int num2){
    int i =1;
    while(i<=num2){
        int factor=num1*i;
        if(factor%num2==0){
            return factor;
        }
        i++;
    }
    return 0 ;
    }
}
