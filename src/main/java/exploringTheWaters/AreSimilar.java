package exploringTheWaters;

import java.util.Arrays;

public class AreSimilar {

    static boolean  areSimilar(int[] a, int[] b) {

       Arrays.sort(a);
       Arrays.sort(b);

  if(a == b){
      return true;
  } else {
      return false;
    }
    }


    public static void main(String[] args) {
        System.out.println(areSimilar(new int[]{1,2,3},new int []{1,2,3}));
    }

}
