package exploringTheWaters;

public class ArrayChange {

    static int arrayChange(int[] inputArray){


        //czemu bez wihile'a nie działa
        int sum =0;
        boolean increase = true;
       while(increase){
         increase = false;
         for(int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                inputArray[i]++;
                sum++;
                increase = true;
            }
        }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayChange(new  int [] {1,1,1}));
    }
}
