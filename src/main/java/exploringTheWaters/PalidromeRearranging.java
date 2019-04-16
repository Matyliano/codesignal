package exploringTheWaters;

public class PalidromeRearranging {


    boolean palindromeRearranging(String inputString) {


        String reverse = " ";
        for(int i = inputString.length()-1; i >= 0; i--){

            reverse = inputString.charAt(i) + " ";
        }

        char [] charArray = inputString.toCharArray();





        if(inputString != reverse){
            return  false;
        }
        return true;

    }





}
