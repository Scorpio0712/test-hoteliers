
public class test_Ten {

    public static void main(String[] args) {
        int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrixB = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

        int[][] matrixResult = new int[matrixA.length][matrixA[0].length];
        
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                matrixResult[row][col] = matrixA[row][col] + matrixB[row][col];
            }
        }
        for (int row = 0; row < matrixResult.length; row++) {
            for (int col = 0; col < matrixResult[row].length; col++) {

                System.out.print(matrixResult[row][col] + " ");
            }
            System.out.println();
        }

    }
}