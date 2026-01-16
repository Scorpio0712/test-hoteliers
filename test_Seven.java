import java.util.Scanner;

public class test_Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number A: ");
        int numA = scanner.nextInt();

        System.out.println("Enter you number B: ");
        int numB = scanner.nextInt();

        System.out.println("result: " + (triangleFormula(numA, numB)));
    }

    public static int triangleFormula(int a, int b) {
        int result = 0;
        result = (a * a) + (b * b);
        return result;
    }
}
