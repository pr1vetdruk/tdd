package ru.somsin.tdd.chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);

        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);

        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare() {
        rollSpare();

        game.roll(7);

        rollMany(17, 0);

        assertEquals(24, game.score());
    }

    @Test
    public void oneStrike() {
        rollStrike();

        game.roll(2);
        game.roll(3);

        rollMany(16, 0);

        assertEquals(20, game.score());
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        rollMany(2, 5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}
