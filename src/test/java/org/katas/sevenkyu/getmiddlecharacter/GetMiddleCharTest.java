package org.katas.sevenkyu.getmiddlecharacter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMiddleCharTest {

    private final GetMiddleChar getMiddleChar = new GetMiddleChar();

    @ParameterizedTest
    @CsvSource({
            "test, es",
            "hallo, l",
            "testing, t"

    })
    void getMidChar(String word, String expected) {
        String result = getMiddleChar.getMidChar(word);
        assertEquals(expected, result);
    }
}