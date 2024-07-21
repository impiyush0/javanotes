import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        int A=12,B=9,C=6;
        if ((A>=B) && (A>=C)) {
            System.out.println("A is largest");
        }
        else if (B>=C) {
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}
