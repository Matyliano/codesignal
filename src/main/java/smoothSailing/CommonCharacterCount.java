package smoothSailing;

import java.util.Arrays;
import java.util.stream.Stream;

public class CommonCharacterCount {
    //Given two strings, find the number of common characters between them.     licza wspolnych znakow

    static int commonCharacterCount(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);


        int count = 0;

        // Update the frequencies of
        // the characters of string s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        // Update the frequencies of
        // the characters of string s2
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Find the count of valid pairs
        for (int i = 0; i < 26; i++) {
            count += (Math.min(freq1[i], freq2[i]));
        }

        return count;
    }
}
