package ru.somsin.tdd.chapter3;

import java.util.List;

public class BubbleSort {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            for (int limit = list.size() - 1; limit > 0; limit--) {
                for (int firstIndex = 0; firstIndex < limit; firstIndex++) {
                    int secondIndex = firstIndex + 1;

                    Integer first = list.get(firstIndex);
                    Integer second = list.get(secondIndex);

                    if (first > second) {
                        list.set(firstIndex, second);
                        list.set(secondIndex, first);
                    }
                }
            }
        }

        return list;
    }
}
