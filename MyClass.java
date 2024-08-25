import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Associate[] arr = new Associate[size];
        for(int i =0;i<arr.length;i++){
            int a = sc.nextInt();
            String b =  sc.nextLine();
            double c = sc.nextDouble();
            int d = sc.nextInt();
            arr[i]= new Associate(a,b,c,d);

        }
        double score = sc.nextDouble();
        Associate step1 = searchAssociateByStroes(arr,score);
        if(step1==null){
            System.out.println("no Associate found with mentioned scores\n");
        }
        else{
            System.out.println(step1.getId());
            System.out.println(step1.name);

        }
        Associate Step2 = findAssciaotwithmaxexperience(arr);
            System.out.println(Step2.getId()+" "+ Step2.getExperience());


        sc.close();
    }
    static  Associate searchAssociateByStroes(Associate[] arr, double score){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getScore()==score){
                return arr[i];
            }
        }

        return null;
    }
    static Associate findAssciaotwithmaxexperience(Associate[]arr){
        int max =arr[0].getExperience();
        for(int i =1;i<arr.length;i++){
            if(arr[i].getExperience()>max) {
                max=arr[i].getExperience();

            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i].getExperience()==max){
               return  arr[i];
            }
        }
        return null;
    }


}
class Associate{
    int id;
    String name;
    double score;
    int experience;

    public Associate(int id, String name, double score, int experience) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getExperience() {
        return experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}