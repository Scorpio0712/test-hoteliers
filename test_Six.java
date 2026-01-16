import java.util.Scanner;

public class test_Six {

    public static int factorial(int n) {
        int facNum = 1;

        for (int i = 1; i <= n; i++) {
            facNum = facNum * i;
        }
        return facNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        String inputNum = scanner.nextLine();

        int num = Integer.parseInt(inputNum);

        System.out.println("result: " + factorial(num));
        scanner.close();
    }
}
