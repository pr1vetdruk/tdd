package ru.somsin.tdd.chapter3;

import java.util.ArrayList;
import java.util.List;

public class FastSort {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        if (list.size() == 0) {
            return result;
        }

        Integer middle = list.get(0);

        List<Integer> middles = list.stream()
                .filter(value -> value.equals(middle))
                .toList();

        List<Integer> lesser = list.stream()
                .filter(value -> value < middle)
                .toList();

        List<Integer> greater = list.stream()
                .filter(value -> value > middle)
                .toList();

        result.addAll(sort(lesser));
        result.addAll(middles);
        result.addAll(sort(greater));

        return result;
    }
}
