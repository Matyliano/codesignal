package edgeOfTheOcean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {
       int count = 0;
       Arrays.sort(statues);

       for(int i=0; i < statues.length-1; i ++ ){
           count += statues[i+1] - statues[i]-1;
       }
     return count;
    }


}
