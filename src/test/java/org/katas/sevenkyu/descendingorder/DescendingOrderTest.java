package org.katas.sevenkyu.descendingorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescendingOrderTest {

    private final DescendingOrder descendingOrder = new DescendingOrder();

    @ParameterizedTest
    @CsvSource({
            "42145,54421",
            "145263,654321",
            "123456789,987654321"
    })
    void sortDesc(int input, int expected) {
        int result = descendingOrder.sortDesc(input);
        assertEquals(expected, result);
    }
}