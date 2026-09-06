//1.Build an ASCII-to-decimal converter.
//2.Build a number-base converter supporting binary, decimal, octal, and hexadecimal.
//3.Write a program that reads an image and prints its pixel values.
//4.Write a program that consumes pixel values and creates an image.
//5.Test boundary cases, including zero, the largest supported unsigned value, and at least one negative two's-complement value.

public class hw0 {
    public static void main(String[] args) {
        String s = "Apple";
        for (Character c : s.toCharArray()) {
            System.out.print((int)c);
        }
    }
}
