public class revers {
    public static void main(String[] args) {

    }

    public static int  reversed1(int num) {
        int ans =0;
        while(num>=0){
            int r   = num%10;
            ans= ans*10+r;
            num/=10;
        }
        return ans;

    }
}
