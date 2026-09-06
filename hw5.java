//5.Test boundary cases, including zero, the largest supported unsigned value, and at least one negative two's-complement value.
public class hw5 {
    public static void main(String[] args) {
        int zero = 0;
        int maxUnsigned = 255;
        int negative = -5;
        System.out.println("zero: ");
        System.out.println("Decimal: " + zero);
         System.out.println("8-bit Binary: " + String.format("%8s", Integer.toBinaryString(zero)).replace(' ', '0'));
        System.out.println();
        System.out.println("Largest 8-bit unigned value: ");
        System.out.println("Decimal: " + maxUnsigned);
        System.out.println("Binary: " + Integer.toBinaryString(maxUnsigned));
        System.out.println("Octal: " + Integer.toOctalString(maxUnsigned));
        System.out.println("Hexadecimal: " + Integer.toHexString(maxUnsigned).toUpperCase());
        System.out.println();
        System.out.println("Negative two's-complement value:");
        System.out.println("Decimal: " + negative);
        System.out.println("8-bit Binary: " + String.format("%8s", Integer.toBinaryString(negative & 0xFF)).replace(' ', '0'));
    }
}
