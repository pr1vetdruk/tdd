package ru.somsin.tdd.util;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
    public static List<Integer> asList(int... values) {
        List<Integer> list = new ArrayList<>();

        if (values != null) {
            for (int value : values) {
                list.add(value);
            }
        }

        return list;
    }
}
