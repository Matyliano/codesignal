package edgeOfTheOcean;

public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {

//        int zmienna = sequence[0];
        int count = 0;
        int length = sequence.length;
        int count2 = -1;

        for (int i = 0; i < length; i++) {
            if (sequence[i - 1] >= sequence[i]) {
                count++;
                count2 = i;
            }
        }
        if (count > 1) {
            return false;
        } else if (count == 0) {
            return true;
        } else if (count2 == length - 1 || count2 == 1) {
            return true;
        } else if (sequence[count2 - 1] < sequence[count2 + 1]) {
            return true;
        } else if (sequence[count2 - 2] < sequence[count2]) {
            return true;
        }
        return false;
    }

}

