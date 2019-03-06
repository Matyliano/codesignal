package smoothSailing;


import java.util.stream.Stream;

public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {

        int length = 0;

        for (int i=0; i < inputArray.length; i++) {
            if (length < inputArray[i].length()) {
                length = inputArray[i].length();


            }
        }
        int longest = length;
            return Stream.of(inputArray).filter(s -> s.length() == longest).toArray(String[]::new);
        }

    }
