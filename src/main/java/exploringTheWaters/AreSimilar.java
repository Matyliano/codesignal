package exploringTheWaters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AreSimilar {

    static boolean  areSimilar(int[] a, int[] b) {

        int hops = 0;
        Set set1 = new HashSet();
        Set set2 = new HashSet();

        for(int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                hops++;
                set1.add(a[i]);
                set2.add(b[i]);
            }
        }
         if (hops == 0){
            return true;
          } else if ( hops == 2 && set1.equals(set2)){
             return true;
         }
         return false;
    }


    public static void main(String[] args) {
        System.out.println(areSimilar(new int[]{1,2,3,4},new int []{3,4,2,1}));
    }

}
