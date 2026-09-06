//2.Build a number-base converter supporting binary, decimal, octal, and hexadecimal.
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        int decimal = Integer.parseInt(input, base);

        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());

        sc.close();
    }
}
