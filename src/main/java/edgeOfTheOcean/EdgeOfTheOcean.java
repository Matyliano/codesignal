package edgeOfTheOcean;

public class EdgeOfTheOcean {

    //znajdz parę sąsiednich elementów, któcyh iloczyn będzie największy

    int adjacentElementsProduct(int[] inputArray) {
        int product;
        int maxProduct = inputArray[0]* inputArray[1];
        if (inputArray.length < 2) {
            return 0;
        }
        for(int i =2; i < inputArray.length; i++){
                product = inputArray[i-1] * inputArray[i];
                if( maxProduct < product) {
                    maxProduct = product;
                }
            }

return maxProduct;
    }

}

