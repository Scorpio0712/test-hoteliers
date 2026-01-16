import java.util.ArrayList;
import java.util.List;

public class test_Five {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> primeNum = new ArrayList<>();
        int n = 500;

        for (int i = 0; i < n + 1; i++) {
            if (isPrime(i) == true) {
                primeNum.add(i);
            }
        }
        System.out.print("Prime Number 0 to 500: " + primeNum);
    }
}
