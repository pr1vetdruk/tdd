package ru.somsin.tdd.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.somsin.tdd.chapter3.WordWrap.wrap;

public class WrapTest {
    @Test
    public void testWrap() {
        assertWrapper("", 1, "");
        assertWrapper("x", 1, "x");
        assertWrapper("xx", 1, "x\nx");
        assertWrapper("xxx", 1, "x\nx\nx");
        assertWrapper("xx", 2, "xx");
        assertWrapper("xxx", 2, "xx\nx");
        assertWrapper("xxx", 3, "xxx");
        assertWrapper("x x", 1, "x\nx");
        assertWrapper("x x", 2, "x\nx");
        assertWrapper("x x", 3, "x x");
        assertWrapper("x x x", 1, "x\nx\nx");
        assertWrapper("x x x", 2, "x\nx\nx");
        assertWrapper("x x x", 3, "x x\nx");
        assertWrapper("x x x", 4, "x x\nx");
        assertWrapper("x x x", 5, "x x x");
        assertWrapper("xx xx", 1, "x\nx\nx\nx");
        assertWrapper("xx xx", 2, "xx\nxx");
        assertWrapper("xx xx", 3, "xx\nxx");
        assertWrapper("xx xx", 3, "xx\nxx");
        assertWrapper("xx xx", 5, "xx xx");

        String text = "Fourscore and seven years ago our fathers brought forth upon this continent a new nation conceived in liberty and " +
                "dedicated to the proposition that all men are created equal That looks right.";

        assertWrapper(
                text,
                15,
                "Fourscore and\nseven years ago\nour fathers\nbrought forth\nupon this\ncontinent a new\nnation\nconceived in\n" +
                        "liberty and\ndedicated to\nthe proposition\nthat all men\nare created\nequal That\nlooks right."
        );

        System.out.println(wrap(text, 30));
    }

    private void assertWrapper(String text, int width, String expected) {
        assertEquals(expected, wrap(text, width));
    }
}
