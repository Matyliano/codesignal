package smoothSailing;

import java.util.*;

public class SortByHeight {

    int[] sortByHeight(int[] a) {
        int[] temporary = a.clone();

        Arrays.sort(a);

        List<Integer> list = new ArrayList<>();

        for (int n : a) {
            if (n != -1)
                list.add(n);
        }
        for (int i = 0, j = 0; i < temporary.length; i++) {

            if (temporary[i] != -1) {
                temporary[i] = list.get(j);
                j++;
            }
        }
        return temporary;

    }


}
