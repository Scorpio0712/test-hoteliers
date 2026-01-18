
import java.util.Scanner;

public class test_Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you binary number: ");
        int binaryString = scanner.nextInt();

        System.out.println("Result: " + binary_to_decimal(binaryString));
    }

    public static int binary_to_decimal(int binary) {
        int decimalValue = 0;
        int numBase = 1;
        int last_Digit = 0;
        System.out.println("Binary: " + binary + "\n----------");

        while (binary > 0) {
            last_Digit = binary % 10;

            binary = binary / 10;
            decimalValue += last_Digit * numBase;

            System.out.println(
                    "Last Digit: " + last_Digit + "\nPower: " + numBase + "\nDecimal: " + decimalValue
                            + "\n----------");

            numBase = numBase * 2;
        }
        return decimalValue;
    }
}
