import java.util.Scanner;

public class test_Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you num to create 'X Stars': ");
        int inputNum = scanner.nextInt();

        System.out.println("Result: ");
        for (int row = 1; row <= inputNum; row++) {
            for (int col = 1; col <= inputNum; col++) {
                if (row == col || col == inputNum + 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
