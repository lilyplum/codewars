package org.katas.sevenkyu.getmiddlecharacter;

public class GetMiddleChar {
    public String getMidChar(String word) {
        int wordLength = word.length();
        int middle = (int) Math.floor(wordLength / 2);

        if (wordLength % 2 == 0) {
            return word.substring(middle - 1, middle + 1);
        }
        return word.substring(middle, middle + 1);
    }
}
