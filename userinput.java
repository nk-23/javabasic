import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = scanner.nextLine();
        System.out.println("welcome"+name);
        System.out.println(name +"enter you age");
        int age = scanner.nextInt();
        System.out.print(name + age);



    }
}
