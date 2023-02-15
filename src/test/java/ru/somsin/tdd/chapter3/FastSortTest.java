package ru.somsin.tdd.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.somsin.tdd.chapter3.FastSort.sort;
import static ru.somsin.tdd.util.CollectionUtils.asList;

public class FastSortTest {
    @Test
    public void testSort() {
        assertEquals(asList(), sort(asList()));
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 3, 2)));
        assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(3, 1, 2)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 3, 1)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(1, 2, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(2, 1, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(4, 3, 2, 1)));
        assertEquals(asList(1, 1, 2, 3), sort(asList(1, 3, 1, 2)));
    }
}
