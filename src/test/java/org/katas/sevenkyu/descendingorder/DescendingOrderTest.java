package org.katas.sevenkyu.descendingorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescendingOrderTest {

    private final DescendingOrder descendingOrder = new DescendingOrder();

    @ParameterizedTest
    @CsvSource({
            "54421,42145",
            "654321,145263",
            "987654321,123456789"
    })
    void sortDesc(int expected, int input) {
        int result = descendingOrder.sortDesc(input);
        assertEquals(expected, result);
    }
}