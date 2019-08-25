package islandOfKnowledge;

public class BoxBlur {

    int[][] boxBlur(int[][] image) {
        int x = image[0].length - 2;
        int y = image.length - 2;
        int[][] b = new int[y][];

        for(int i = 0;i < y;i++){
            b[i] = new int[x];
            for(int j = 0;j < x;j++){
                b[i][j] = image[i][j] + image[i][j+1] + image[i][j+2] +
                        image[i+1][j] + image[i+1][j+1] + image[i+1][j+2] +
                        image[i+2][j] + image[i+2][j+1] + image[i+2][j+2];
                b[i][j] /= 9;
            }
        }
        return b;
    }



}
