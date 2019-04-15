package smoothSailing;

public class ReverseInParentheses {

   public static  String reverseInParentheses(String inputString) {



       String tempString = "";

       for(int i = inputString.length()-1; i >= 0; i--) {
           tempString = tempString +  inputString.charAt(i);
       }
       return tempString.toLowerCase();

   }


    public static void main(String[] args) {
        System.out.println(reverseInParentheses("Asia"));
    }



}
