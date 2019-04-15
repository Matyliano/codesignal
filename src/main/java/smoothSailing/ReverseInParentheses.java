package smoothSailing;

public class ReverseInParentheses {

      String reverseString(String string){
         char[] try1 = string.toCharArray();
         String reverse = "";
         for (int i = try1.length-1; i>=0; i--)
             reverse += Character.toString(try1[i]);

         return reverse;
    }

    String reverseInParentheses(String inputString) {

       //char [] charArray = reverseString(inputString).toCharArray();
       int startIndex = 0;
       int endIndex = inputString.length() - 1;

       for (int i = 0; i < inputString.length(); i++) {

           if (inputString.charAt(i) == '(') {
               startIndex = i;
           } else if (inputString.charAt(i) == ')') {
               endIndex = i;


               String temporary = inputString.substring(startIndex + 1, endIndex);

               return reverseInParentheses(inputString.substring(0, startIndex) + reverseString(temporary) + inputString.substring(endIndex + 1));
           }
       }
   return inputString;
   }


}
