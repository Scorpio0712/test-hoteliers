
import java.util.Scanner;

public class test_Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you binary number: ");
        int binaryString = scanner.nextInt();
        System.out.println("----------");
        System.out.println("Result: " + binary_to_decimal(binaryString));
        scanner.close();
    }

    public static int binary_to_decimal(int binary) {
        int decimalValue = 0;
        int numBase = 1;
        int last_Digit = 0;

        while (binary > 0) {
            last_Digit = binary % 10;

            binary = binary / 10;
            decimalValue += last_Digit * numBase;

            numBase = numBase * 2;
        }
        return decimalValue;
    }
}
