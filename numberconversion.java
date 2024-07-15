import java.util.*;
public class numberconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); 
        String hexNumber = Integer.toHexString(number);
        String octalNumber = Integer.toOctalString(number);
        String binaryNumber = Integer.toBinaryString(number);
        System.out.println("Decimal Value: " + number);
        System.out.println("Hexadecimal Value: " + hexNumber);
        System.out.println("Octal Value: " + octalNumber);
        System.out.println("Binary Value: " + binaryNumber);
        System.out.print("\nEnter a hexadecimal number: ");
        hexNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("Decimal equivalent: " + decimalNumber);s
        scanner.close();
    }
}
