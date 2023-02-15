package ru.somsin.tdd.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.somsin.tdd.chapter3.BubbleSort.sort;
import static ru.somsin.tdd.util.CollectionUtils.asList;

public class BubbleSortTest {
    @Test
    public void sorted() {
        assertEquals(asList(), sort(asList()));
    }

    @Test
    public void sorted_1() {
        assertEquals(asList(1), sort(asList(1)));
    }

    @Test
    public void sorted_12_12() {
        assertEquals(asList(1, 2), sort(asList(1, 2)));
    }

    @Test
    public void sorted_12_21() {
        assertEquals(asList(1, 2), sort(asList(2, 1)));
    }

    @Test
    public void sorted_123_123() {
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
    }

    @Test
    public void sorted_123_213() {
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
    }

    @Test
    public void sorted_123_231() {
        assertEquals(asList(1, 2, 3), sort(asList(2, 3, 1)));
    }

    @Test
    public void sorted_final() {
        assertEquals(
                asList(1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9),
                sort(asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3))
        );
    }
}
