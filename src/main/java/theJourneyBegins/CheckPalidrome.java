package theJourneyBegins;

public class CheckPalidrome {

    boolean checkPalindrome(String inputString) {

        int length = inputString.length();

//     String string = "";
//     for (int i = length - 1; i >= 0; i--){
//         string = string + inputString.charAt(i);
//     }
//     if(inputString.equals(string)){
//         return true;
//     }
//     return false;
//      int l = inputString.length();
        for(int i = 0; i<length/2;i++){
            if(inputString.charAt(i) != inputString.charAt(length-1-i)){

                return false;
            }}
        return true;
    }

}
