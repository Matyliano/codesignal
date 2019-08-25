package islandOfKnowledge;

public class ArrayMaximum {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int abs = Math.abs(inputArray[i] - inputArray[i + 1]);
            if(max < abs)
                max = abs;
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayMaximum a = new ArrayMaximum();
        System.out.println();
        System.out.println(a.arrayMaximalAdjacentDifference(new  int[] {2,4,1,0}));

    }


}
