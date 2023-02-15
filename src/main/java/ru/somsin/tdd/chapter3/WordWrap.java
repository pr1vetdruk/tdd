package ru.somsin.tdd.chapter3;

public class WordWrap {
    public static String wrap(String text, int width) {
        if (text.length() > width) {
            int endWordIndex = text.lastIndexOf(" ", width);
            if (endWordIndex == -1) {
                endWordIndex = width;
            }

            return text.substring(0, endWordIndex).trim() + "\n" + wrap(text.substring(endWordIndex).trim(), width);
        }

        return text;
    }
}
