package easy.Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseArray = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            String morse     = "";
            for (char ch : wordArray) {
                morse = morse + morseArray[(int) ch - 97];
            }
            set.add(morse);
        }

        return set.size();
    }
}
