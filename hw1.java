//1.Build an ASCII-to-decimal converter.
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII decimal value: " + ascii);

        sc.close();
    }
}
