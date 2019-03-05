package edgeOfTheOcean;

public class MatrixElementSum {


    //sumujemy wszystkie elementy arraya za wyjątkiem 0 i elementów pod zerami
    int matrixElementsSum(int[][] matrix) {

        int sum = 0;
        int length = matrix.length;
        for (int j = 0; j < matrix[0].length; j++) {   //KOLEJNOŚĆ I I J JEST WAŻNA
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 0) {
                    break;
                } else {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;

    }

}
