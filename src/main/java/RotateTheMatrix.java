public class RotateTheMatrix {

    int[][] rotateImage(int[][] a) {
        final int halfLen = a.length / 2;
        final int maxInd = a.length - 1;

        for (int i = 0; i < halfLen; i++) {
            int shift = a.length - i - 1;
            for (int j = i; j < shift; j++) {
                int temp = a[i][j];
                a[i][j] = a[maxInd - j][i];
                a[maxInd - j][i] = a[maxInd - i][maxInd - j];
                a[maxInd - i][maxInd - j] = a[j][maxInd - i];
                a[j][maxInd - i] = temp;
            }
        }

        return a;
    }

}
