package islandOfKnowledge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IsIPv4Address {

    boolean isIPv4Address(String inputString) {

        if (inputString == null || inputString.isEmpty()){
            return false;
        }


        inputString = inputString.trim();


        if ((inputString.length() < 6) & (inputString.length() > 15)){
            return false;
        }


        try {
            Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(inputString);
            return matcher.matches();
        } catch (PatternSyntaxException ex) {
            return false;
        }
    }






}
