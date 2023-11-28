package org.katas.sixkyu.decodemorsecode;

public class DecodeMorseCode {
    public String decode (String morseCode) {
        String morseCodeTrimmed = morseCode.trim();
        String[] morseWords = morseCode.split("   ");
        StringBuilder decoded = new StringBuilder();

        for (String morseWord : morseWords) {
            String[] morseCharacters = morseWord.split(" ");
            for (String morseCharacter : morseCharacters) {
                String decodedCharacter = MorseCode.get(morseCharacter);
                if (decodedCharacter == null) continue;
                decoded.append(decodedCharacter);
            }
            decoded.append(" ");
        }
        String decodedString = decoded.toString().trim();
        return decodedString;
    }
}
