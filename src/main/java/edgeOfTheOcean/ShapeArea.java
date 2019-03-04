package edgeOfTheOcean;

public class ShapeArea {

    int shapeArea(int n) {
        int area = 1;

        for(int i = 1; i < n; i++){
            area += 4 * i;
        }
        return area;
    }

}
