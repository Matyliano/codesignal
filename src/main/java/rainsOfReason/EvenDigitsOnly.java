package rainsOfReason;

public class EvenDigitsOnly {
    static boolean evenDigitsOnly(int n) {
        while (n > 0) {
            int i = n % 10;
            if (i % 2 != 0)
                return false;

            n = n / 10;
        }

        return true;
    }
//      int sum =0;
//      String s = Integer.toString(n);
//      char[] arr = s.toCharArray();
//      for(int i =0; i < arr.length; i++){
//          sum += arr[i];
//      }
//        if(sum % 2 == 0){
//            return true;
//        }
//return false;
  //  }

    public static void main(String[] args) {
        System.out.println(evenDigitsOnly(642386));
    }
}
