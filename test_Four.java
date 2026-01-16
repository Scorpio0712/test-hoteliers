public class test_Four {
    public static void main(String[] args) {
        int[] numberList = { 1, 2, 31, 4, 15, 6, 7, 22, 9, 10 };

        int n = numberList.length;

        for (int i = 0; i < n - 1; i++) {
            int min_Index = i;
            for (int j = i + 1; j < n; j++) {
                if (numberList[j] > numberList[min_Index]) {
                    min_Index = j;
                }
            }
            int minVal = numberList[min_Index];
            for (int k = min_Index; k > i; k--) {
                numberList[k] = numberList[k - 1];
            }
            numberList[i] = minVal;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
        System.out.println();

    }
}