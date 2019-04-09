package smoothSailing;

public class isLucky {

    boolean isLucky(int n) {

//        if (n/2 != 0){
//            System.out.println("Błędny numer biletu");
//        } else {
//
//        }

        String temp = Integer.toString(n);

        char[] newInt = temp.toCharArray();
        int length = newInt.length;
//        for (int i = 0; i < temp.length(); i++) {
//            newInt[i] = temp.charAt(i) - '0';
//        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            sum1 += Character.getNumericValue(newInt[i]);
            sum2 += Character.getNumericValue(newInt[j]);
        }
        return sum1 == sum2;
    }
}
