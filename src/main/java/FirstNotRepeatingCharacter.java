public class FirstNotRepeatingCharacter {
    char firstNotRepeatingCharacter(String s) {

        int[] letters = new int[26]; //  tablica ze wszystkimi literami alfabetu


        for (int i = 0; i < s.length(); i++) { // only iterates over the string once
            int hops = s.charAt(i) - 'a';
            if(letters[hops] == 0){
                letters[hops] = i + 1;
            } else {
                letters[hops] = -1;
            }
            // 0 -> index + 1
            // !0 -> -1
        }

        //  Time complexity is O(1) //  search for the smallest index of not repeating letter
        int hops2 = s.length() + 1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 0 && letters[i] < hops2)
                hops2 = letters[i];
        }

        return (hops2 <= s.length()) ? s.charAt(hops2 - 1) : '_';

    }

}
