package rainsOfReason;

public class AlphabeticShift {

    String alphabeticShift(String inputString) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'z')
                stringBuilder.append('a');
            else
                stringBuilder.append((char) (inputString.charAt(i) + 1));
        }

        return stringBuilder.toString();


    }
}
