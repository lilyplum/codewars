package org.katas.sevenkyu.descendingorder;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrder {
    public int sortDesc(int num) {
        return Integer.parseInt(
                Stream.of(String.valueOf(num).split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }
}
