
public class test_Two {

    public static void main(String[] args) {
        int[] numberList = { 1, 2, 31, 4, 15, 6, 7, 22, 9, 10 };

        int minVal = numberList[0];

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] < minVal) {

                minVal = numberList[i];
            }
        }

        System.out.println("Lower value: " + minVal);

    }
};