package exploringTheWaters;

public class PalidromeRearranging {


    boolean palindromeRearranging(String inputString) {


        // return inputString.equals(new StringBuilder(inputString).reverse().toString());
        int[] charArray = new int[26];
        int a = 0;
        for (int i = 0; i < inputString.length(); i++) {
            charArray[inputString.charAt(i) - 'a']++;
        }
        for (int i : charArray) {
            if (i % 2 == 1) {
                a++;
            }
        }
            return inputString.length() % 2 == a;

    }
    
}
