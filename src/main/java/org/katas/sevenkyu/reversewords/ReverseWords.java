package org.katas.sevenkyu.reversewords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {
    public String reverseString(final String original) {

        return Stream.of(original.split("(?<=\\s)|(?=\\s+)|(?<=\\s$)"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining());
    }
}
