package org.katas.sevenkyu.reversewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsTest {
    private final ReverseWords reverseWords = new ReverseWords();

    @Test
    void reverseString() {
        String input = "This   is an example!";
        String expected = "sihT   si na !elpmaxe";
        String result = reverseWords.reverseString(input);
        assertEquals(expected, result);
    }
}