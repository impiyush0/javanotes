import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
//        String str = sc.next();
//        System.out.println(str);
    }
}

