package exploringTheWaters;

import java.util.Arrays;

public class AlternatingSums {


 static   int [] alternatingSums(int[]a){
        int sum1 = 0;
        int sum2=0;


     int [] team1 = new int[a.length];
        for (int i=0; i < a.length; i++){

            if(i % 2 !=0){
            team1[i]=a[i];
            }
            sum1 += team1[i];
        }

     int [] team2 = new int[a.length];
        for(int i =0; i < a.length; i++){

            if (i % 2 == 0){
                team2[i] = a[i];
            }
           sum2 += team2[i];
        }
         int [] teams = new int[2];
         teams[0] = sum1;
         teams [1] = sum2;

        return teams;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(alternatingSums(new int[]{50, 60, 60, 45, 70})));
    }


}
