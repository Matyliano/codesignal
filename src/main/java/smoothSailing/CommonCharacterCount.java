package smoothSailing;

import java.util.stream.Stream;

public class CommonCharacterCount {
    //Given two strings, find the number of common characters between them.     licza wspolnych znakow

    int commonCharacterCount(String s1, String s2) {

        char [] char1 = s1.toCharArray();
        char [] char2 = s2.toCharArray();

        int [] characters1 = new int[26];
        int [] characters2 = new int[26];
            int commonCharacter =0;

       for(char ch = 'a'; ch <= 'z'; ch++ ){
           for(int i = 0; i  )
       }

        Stream.of(s1).filter(s -> s.length() == commonCharacter).toArray(String[]::new);
    }

}
