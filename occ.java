import java.util.*;
public class occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] num= new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int occurances= sc.nextInt();
        int ans =occu1(num,occurances);
        System.out.println(ans);


    }
    public static  int occu1(int[] num,int number){
        int count =0;
        for(int i=0;i<num.length;i++){
            if(num[i]==number){
                count++;
            }
        }
        return count;

    }
}
