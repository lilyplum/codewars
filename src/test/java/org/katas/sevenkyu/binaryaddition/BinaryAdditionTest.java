package org.katas.sevenkyu.binaryaddition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryAdditionTest {

    private final BinaryAddition binaryAddition = new BinaryAddition();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 101",
            "7, 5, 1100",
            "0, 0, 0"
    })

    void binaryAddition(int a, int b, String expected) {
        String result = binaryAddition.binaryAddition(a, b);
        assertEquals(expected, result);
    }
}